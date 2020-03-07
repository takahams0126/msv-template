package jp.co.example.msvservice1.application.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.example.msvservice1.entity.RegistRequest;
import jp.co.example.msvservice1.entity.RegistResponse;

/**
 * MsvService1コントローラークラス.
 */
@RestController
@RequestMapping("/msv1")
public class MsvService1Controller {

    /**
     * 登録処理を行う.
     *
     * @param request リクエスト情報
     * @return レスポンス
     */
    @PostMapping(value = "/regist")
    public RegistResponse registService1(@RequestBody final RegistRequest request) {

        RegistResponse response = new RegistResponse();
        response.setStatus("OK");
        response.setId(request.getId());
        response.setName(request.getName());

        return response;
    }

}
