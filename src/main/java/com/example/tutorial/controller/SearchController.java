package com.example.tutorial.controller;

import com.example.tutorial.dto.SearchRequestProto;
import com.example.tutorial.dto.SearchResponseProto;
import com.google.protobuf.Message;
import com.googlecode.protobuf.format.JsonFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.googlecode.protobuf.format.JsonFormat.merge;

/**
 * @Author: zn.wang
 * @Date: 2018/12/28 23:39:05
 * @Description:
 */
@RestController
public class SearchController {

    @RequestMapping("searchreq")
    public String instanceRequest() {
        SearchRequestProto.SearchRequest.Request request =
        SearchRequestProto.SearchRequest.Request.newBuilder()
                .setPlatCstId("KF00036")
                .setChannelNo("ChannelNo")
                .setTxnDt("20181221")
                .setTxnTs("130322001")
                .setTxnSrlNo("201812210001")
                .build();

        SearchRequestProto.SearchRequest searchRequest = SearchRequestProto.SearchRequest.newBuilder()
                .setRequest(request)
                .build();
        //pb-2-json
       return JsonFormat.printToString(searchRequest);
    }

    @RequestMapping("searchres")
    public String instanceResponse() {
        SearchResponseProto.SearchResponse searchResponse = SearchResponseProto.SearchResponse.newBuilder()
                .setMsg("SUCCESS")
                .setResult(
                    SearchResponseProto.SearchResponse.Result.newBuilder()
                            .addTdPrdListArry(
                                    SearchResponseProto.SearchResponse.TdPrd.newBuilder()
                                            .setPdCd("prod_001")
                                            .setPdSt("2")
                                            .setBasIntRate("0.04100")
                                            .setPdTp("0")
                                            .setPdNm("prod_001")
                                            .setEarDrwTp("0")
                                            .setIncrsAmt("1.00")
                                            .setPdDepDay("10")
                                            .setDepDayTp("D")
                                            .setSurvAmt("1.00")
                                            .setFloIntRate("0.01000")
                                            .build()
                            )
                            .addTdPrdListArry(
                                    SearchResponseProto.SearchResponse.TdPrd.newBuilder()
                                            .setPdCd("prod_002")
                                            .setPdSt("2")
                                            .setBasIntRate("0.04100")
                                            .setPdTp("0")
                                            .setPdNm("prod_001")
                                            .setEarDrwTp("0")
                                            .setIncrsAmt("1.00")
                                            .setPdDepDay("10")
                                            .setDepDayTp("D")
                                            .setSurvAmt("1.00")
                                            .setFloIntRate("0.01000")
                                            .build()
                            )
                            .addTdPrdListArry(
                                    SearchResponseProto.SearchResponse.TdPrd.newBuilder()
                                            .setPdCd("prod_003")
                                            .setPdSt("2")
                                            .setBasIntRate("0.04100")
                                            .setPdTp("0")
                                            .setPdNm("prod_001")
                                            .setEarDrwTp("0")
                                            .setIncrsAmt("1.00")
                                            .setPdDepDay("10")
                                            .setDepDayTp("D")
                                            .setSurvAmt("1.00")
                                            .setFloIntRate("0.01000")
                                            .build()
                            )
                            .addTdPrdListArry(
                                    SearchResponseProto.SearchResponse.TdPrd.newBuilder()
                                            .setPdCd("prod_004")
                                            .setPdSt("2")
                                            .setBasIntRate("0.04100")
                                            .setPdTp("0")
                                            .setPdNm("prod_001")
                                            .setEarDrwTp("0")
                                            .setIncrsAmt("1.00")
                                            .setPdDepDay("10")
                                            .setDepDayTp("D")
                                            .setSurvAmt("1.00")
                                            .setFloIntRate("0.01000")
                                            .build()
                            )
                            .addTdPrdListArry(
                                    SearchResponseProto.SearchResponse.TdPrd.newBuilder()
                                            .setPdCd("prod_005")
                                            .setPdSt("2")
                                            .setBasIntRate("0.04100")
                                            .setPdTp("0")
                                            .setPdNm("prod_001")
                                            .setEarDrwTp("0")
                                            .setIncrsAmt("1.00")
                                            .setPdDepDay("10")
                                            .setDepDayTp("D")
                                            .setSurvAmt("1.00")
                                            .setFloIntRate("0.01000")
                                            .build()
                            )
                            .addTdPrdListArry(
                                    SearchResponseProto.SearchResponse.TdPrd.newBuilder()
                                            .setPdCd("prod_006")
                                            .setPdSt("2")
                                            .setBasIntRate("0.04100")
                                            .setPdTp("0")
                                            .setPdNm("prod_001")
                                            .setEarDrwTp("0")
                                            .setIncrsAmt("1.00")
                                            .setPdDepDay("10")
                                            .setDepDayTp("D")
                                            .setSurvAmt("1.00")
                                            .setFloIntRate("0.01000")
                                            .build()
                            )
                            .build()
                 )
                .setCode("000000")
                .build();
        //pb-2-json
        return JsonFormat.printToString(searchResponse);
    }



    /**
     * 从protobuf转json
     * @return
     */
    private String pb2Json(){
        Message searchRequest =SearchRequestProto.SearchRequest.getDefaultInstance();
        return JsonFormat.printToString(searchRequest);
    }

    /**
     * 从json转protobuf
     * @return
     */
    private SearchRequestProto.SearchRequest.Builder json2Pb(String json){
        Message.Builder builder = SearchRequestProto.SearchRequest.newBuilder();
        try {
            merge(json, builder);
        } catch (JsonFormat.ParseException e) {
            e.printStackTrace();
        }
        return (SearchRequestProto.SearchRequest.Builder)builder;
    }
}
