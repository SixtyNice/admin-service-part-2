package com.accenture.tveratc.bank.DAO.GlobalSettingDAO;

import com.accenture.tveratc.bank.entity.GlobalSetting;

public interface GlobalSettingDAO {
    GlobalSetting getCode(String code);
    boolean updateValue(String code, String value);
}
