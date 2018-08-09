package com.apin.qunar.basic.service.impl;

import com.apin.qunar.basic.dao.impl.CountryDaoImpl;
import com.apin.qunar.basic.dao.model.Country;
import com.apin.qunar.basic.service.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDaoImpl countryDao;

    @Override
    public Country queryByName(String countryName) {
        Country country = null;
        if (StringUtils.isBlank(countryName)) {
            return country;
        }
        try {
            country = countryDao.queryByName(countryName);
        } catch (Exception e) {
            log.error("查询国家二字码信息异常,name:{}", countryName, e);
        }
        return country;
    }

    @Override
    public Country queryLikeByName(String countryName) {
        Country country = null;
        if (StringUtils.isBlank(countryName)) {
            return country;
        }
        try {
            country = countryDao.queryLikeByName(countryName);
        } catch (Exception e) {
            log.error("查询国家二字码信息异常,name:{}", countryName, e);
        }
        return country;
    }
}