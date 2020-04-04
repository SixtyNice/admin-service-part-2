package com.accenture.tveratc.bank.Model.GlobalSettingService;

import com.accenture.tveratc.bank.DAO.GlobalSettingDAO.GlobalSettingDAO;
import com.accenture.tveratc.bank.DAO.GlobalSettingDAO.GlobalSettingDAOImpl;
import com.accenture.tveratc.bank.entity.GlobalSetting;

public class GlobalSettingServiceImpl implements GlobalSettingService {

    public GlobalSetting getCode(String code) {
        return new GlobalSettingDAOImpl().getCode(code);
    }

    public String updateValue(GlobalSetting globalSetting) {
        GlobalSettingDAO globalSettingDAO = new GlobalSettingDAOImpl();
        String response = "error";
        if (globalSettingDAO.getCode(globalSetting.getCode()) != null) {
            if (tryParseInt(globalSetting.getValue())) {
                if (globalSettingDAO.updateValue(globalSetting.getCode(), globalSetting.getValue())) {
                    response = "success";
                }

            }
        }

        return response;
    }

    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
