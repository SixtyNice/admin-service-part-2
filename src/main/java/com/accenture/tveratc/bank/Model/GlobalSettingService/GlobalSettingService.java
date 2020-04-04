package com.accenture.tveratc.bank.Model.GlobalSettingService;

import com.accenture.tveratc.bank.entity.GlobalSetting;

public interface GlobalSettingService {
    GlobalSetting getCode(String code);
    String updateValue(GlobalSetting globalSetting);
}
