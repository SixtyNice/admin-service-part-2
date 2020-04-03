package com.accenture.tveratc.bank.Model.GlobalSettingService;

import com.accenture.tveratc.bank.DAO.GlobalSettingDAO;
import com.accenture.tveratc.bank.entity.GlobalSetting;

public class GlobalSettingService {

    public GlobalSetting getCode(String code) {
        return new GlobalSettingDAO().getCode(code);
    }

    public String updateValue(GlobalSetting globalSetting) {
        GlobalSettingDAO globalSettingDAO = new GlobalSettingDAO();
        boolean status = globalSettingDAO.updateValue(globalSetting.getCode(), globalSetting.getValue());

        if (status) {
            return "Обновление произошло успешно";
        } else {
            return "Не получилось обновить";
        }
    }
}
