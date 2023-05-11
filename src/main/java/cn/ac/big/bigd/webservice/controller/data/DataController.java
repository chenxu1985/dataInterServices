package cn.ac.big.bigd.webservice.controller.data;

import cn.ac.big.bigd.webservice.mapper.gsa.GsaMapper;
import cn.ac.big.bigd.webservice.model.gsa.FairDetail;
import cn.ac.big.bigd.webservice.model.gsa.FairList;
import cn.ac.big.bigd.webservice.model.gsa.Fund;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * author chenxu
 */
@RestController
public class DataController {

    @Autowired
    private GsaMapper gsaMapper;
    @RequestMapping(value = "/getAccessionList")
    public List<FairList> getFairAccession(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        List<FairList> fairLists = this.gsaMapper.getFairAccessionGsa();

        return fairLists;
    }

    @RequestMapping(value = "/getAccessionDetail/{accession}")
    public FairDetail getFairDetailGsa(@PathVariable("accession") String accession,HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        FairDetail fairDetail = this.gsaMapper.getFairDetailGsa(accession);
        List<Fund> funds = this.gsaMapper.getFundGsa(fairDetail.getPrjId());
        fairDetail.setFund(funds);
        return fairDetail;
    }
    /**
     * 将json数据转换成pojo对象list/map
     */
    public static List jsonToList(String jsonData, Class beanType) {
        ObjectMapper MAPPER = new ObjectMapper();
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        //如果是Map类型  MAPPER.getTypeFactory().constructParametricType(HashMap.class,String.class, beanType);
        try {
            //是否强制让非数组模式的json字符串与java集合类型相匹配，默认是false，这里改为true
            MAPPER.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            List list = MAPPER.readValue(jsonData, javaType);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
