package com.apin.qunar.order.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer mysqlOffset;

    private Integer mysqlLength;

    public GroupOrderDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @param mysqlOffset 指定返回记录行的偏移量<br> mysqlOffset= 5,mysqlLength=10;  // 检索记录行 6-15
     */
    public void setMysqlOffset(Integer mysqlOffset) {
        this.mysqlOffset = mysqlOffset;
    }

    public Integer getMysqlOffset() {
        return mysqlOffset;
    }

    /**
     * @param mysqlLength 指定返回记录行的最大数目<br> mysqlOffset= 5,mysqlLength=10;  // 检索记录行 6-15
     */
    public void setMysqlLength(Integer mysqlLength) {
        this.mysqlLength = mysqlLength;
    }

    public Integer getMysqlLength() {
        return mysqlLength;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoIsNull() {
            addCriterion("ticket_no is null");
            return (Criteria) this;
        }

        public Criteria andTicketNoIsNotNull() {
            addCriterion("ticket_no is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNoEqualTo(String value) {
            addCriterion("ticket_no =", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotEqualTo(String value) {
            addCriterion("ticket_no <>", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoGreaterThan(String value) {
            addCriterion("ticket_no >", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_no >=", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoLessThan(String value) {
            addCriterion("ticket_no <", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoLessThanOrEqualTo(String value) {
            addCriterion("ticket_no <=", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoLike(String value) {
            addCriterion("ticket_no like", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotLike(String value) {
            addCriterion("ticket_no not like", value, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoIn(List<String> values) {
            addCriterion("ticket_no in", values, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotIn(List<String> values) {
            addCriterion("ticket_no not in", values, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoBetween(String value1, String value2) {
            addCriterion("ticket_no between", value1, value2, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andTicketNoNotBetween(String value1, String value2) {
            addCriterion("ticket_no not between", value1, value2, "ticketNo");
            return (Criteria) this;
        }

        public Criteria andClientSiteIsNull() {
            addCriterion("client_site is null");
            return (Criteria) this;
        }

        public Criteria andClientSiteIsNotNull() {
            addCriterion("client_site is not null");
            return (Criteria) this;
        }

        public Criteria andClientSiteEqualTo(String value) {
            addCriterion("client_site =", value, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteNotEqualTo(String value) {
            addCriterion("client_site <>", value, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteGreaterThan(String value) {
            addCriterion("client_site >", value, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteGreaterThanOrEqualTo(String value) {
            addCriterion("client_site >=", value, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteLessThan(String value) {
            addCriterion("client_site <", value, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteLessThanOrEqualTo(String value) {
            addCriterion("client_site <=", value, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteLike(String value) {
            addCriterion("client_site like", value, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteNotLike(String value) {
            addCriterion("client_site not like", value, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteIn(List<String> values) {
            addCriterion("client_site in", values, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteNotIn(List<String> values) {
            addCriterion("client_site not in", values, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteBetween(String value1, String value2) {
            addCriterion("client_site between", value1, value2, "clientSite");
            return (Criteria) this;
        }

        public Criteria andClientSiteNotBetween(String value1, String value2) {
            addCriterion("client_site not between", value1, value2, "clientSite");
            return (Criteria) this;
        }

        public Criteria andFlightNumIsNull() {
            addCriterion("flight_num is null");
            return (Criteria) this;
        }

        public Criteria andFlightNumIsNotNull() {
            addCriterion("flight_num is not null");
            return (Criteria) this;
        }

        public Criteria andFlightNumEqualTo(String value) {
            addCriterion("flight_num =", value, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumNotEqualTo(String value) {
            addCriterion("flight_num <>", value, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumGreaterThan(String value) {
            addCriterion("flight_num >", value, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumGreaterThanOrEqualTo(String value) {
            addCriterion("flight_num >=", value, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumLessThan(String value) {
            addCriterion("flight_num <", value, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumLessThanOrEqualTo(String value) {
            addCriterion("flight_num <=", value, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumLike(String value) {
            addCriterion("flight_num like", value, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumNotLike(String value) {
            addCriterion("flight_num not like", value, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumIn(List<String> values) {
            addCriterion("flight_num in", values, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumNotIn(List<String> values) {
            addCriterion("flight_num not in", values, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumBetween(String value1, String value2) {
            addCriterion("flight_num between", value1, value2, "flightNum");
            return (Criteria) this;
        }

        public Criteria andFlightNumNotBetween(String value1, String value2) {
            addCriterion("flight_num not between", value1, value2, "flightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumIsNull() {
            addCriterion("act_flight_num is null");
            return (Criteria) this;
        }

        public Criteria andActFlightNumIsNotNull() {
            addCriterion("act_flight_num is not null");
            return (Criteria) this;
        }

        public Criteria andActFlightNumEqualTo(String value) {
            addCriterion("act_flight_num =", value, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumNotEqualTo(String value) {
            addCriterion("act_flight_num <>", value, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumGreaterThan(String value) {
            addCriterion("act_flight_num >", value, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumGreaterThanOrEqualTo(String value) {
            addCriterion("act_flight_num >=", value, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumLessThan(String value) {
            addCriterion("act_flight_num <", value, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumLessThanOrEqualTo(String value) {
            addCriterion("act_flight_num <=", value, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumLike(String value) {
            addCriterion("act_flight_num like", value, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumNotLike(String value) {
            addCriterion("act_flight_num not like", value, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumIn(List<String> values) {
            addCriterion("act_flight_num in", values, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumNotIn(List<String> values) {
            addCriterion("act_flight_num not in", values, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumBetween(String value1, String value2) {
            addCriterion("act_flight_num between", value1, value2, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andActFlightNumNotBetween(String value1, String value2) {
            addCriterion("act_flight_num not between", value1, value2, "actFlightNum");
            return (Criteria) this;
        }

        public Criteria andFlightTimeIsNull() {
            addCriterion("flight_time is null");
            return (Criteria) this;
        }

        public Criteria andFlightTimeIsNotNull() {
            addCriterion("flight_time is not null");
            return (Criteria) this;
        }

        public Criteria andFlightTimeEqualTo(String value) {
            addCriterion("flight_time =", value, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeNotEqualTo(String value) {
            addCriterion("flight_time <>", value, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeGreaterThan(String value) {
            addCriterion("flight_time >", value, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeGreaterThanOrEqualTo(String value) {
            addCriterion("flight_time >=", value, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeLessThan(String value) {
            addCriterion("flight_time <", value, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeLessThanOrEqualTo(String value) {
            addCriterion("flight_time <=", value, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeLike(String value) {
            addCriterion("flight_time like", value, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeNotLike(String value) {
            addCriterion("flight_time not like", value, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeIn(List<String> values) {
            addCriterion("flight_time in", values, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeNotIn(List<String> values) {
            addCriterion("flight_time not in", values, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeBetween(String value1, String value2) {
            addCriterion("flight_time between", value1, value2, "flightTime");
            return (Criteria) this;
        }

        public Criteria andFlightTimeNotBetween(String value1, String value2) {
            addCriterion("flight_time not between", value1, value2, "flightTime");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeIsNull() {
            addCriterion("carrier_code is null");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeIsNotNull() {
            addCriterion("carrier_code is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeEqualTo(String value) {
            addCriterion("carrier_code =", value, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeNotEqualTo(String value) {
            addCriterion("carrier_code <>", value, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeGreaterThan(String value) {
            addCriterion("carrier_code >", value, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("carrier_code >=", value, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeLessThan(String value) {
            addCriterion("carrier_code <", value, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeLessThanOrEqualTo(String value) {
            addCriterion("carrier_code <=", value, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeLike(String value) {
            addCriterion("carrier_code like", value, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeNotLike(String value) {
            addCriterion("carrier_code not like", value, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeIn(List<String> values) {
            addCriterion("carrier_code in", values, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeNotIn(List<String> values) {
            addCriterion("carrier_code not in", values, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeBetween(String value1, String value2) {
            addCriterion("carrier_code between", value1, value2, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierCodeNotBetween(String value1, String value2) {
            addCriterion("carrier_code not between", value1, value2, "carrierCode");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNull() {
            addCriterion("carrier_name is null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIsNotNull() {
            addCriterion("carrier_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierNameEqualTo(String value) {
            addCriterion("carrier_name =", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotEqualTo(String value) {
            addCriterion("carrier_name <>", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThan(String value) {
            addCriterion("carrier_name >", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameGreaterThanOrEqualTo(String value) {
            addCriterion("carrier_name >=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThan(String value) {
            addCriterion("carrier_name <", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLessThanOrEqualTo(String value) {
            addCriterion("carrier_name <=", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameLike(String value) {
            addCriterion("carrier_name like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotLike(String value) {
            addCriterion("carrier_name not like", value, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameIn(List<String> values) {
            addCriterion("carrier_name in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotIn(List<String> values) {
            addCriterion("carrier_name not in", values, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameBetween(String value1, String value2) {
            addCriterion("carrier_name between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andCarrierNameNotBetween(String value1, String value2) {
            addCriterion("carrier_name not between", value1, value2, "carrierName");
            return (Criteria) this;
        }

        public Criteria andStopCntIsNull() {
            addCriterion("stop_cnt is null");
            return (Criteria) this;
        }

        public Criteria andStopCntIsNotNull() {
            addCriterion("stop_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andStopCntEqualTo(Integer value) {
            addCriterion("stop_cnt =", value, "stopCnt");
            return (Criteria) this;
        }

        public Criteria andStopCntNotEqualTo(Integer value) {
            addCriterion("stop_cnt <>", value, "stopCnt");
            return (Criteria) this;
        }

        public Criteria andStopCntGreaterThan(Integer value) {
            addCriterion("stop_cnt >", value, "stopCnt");
            return (Criteria) this;
        }

        public Criteria andStopCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("stop_cnt >=", value, "stopCnt");
            return (Criteria) this;
        }

        public Criteria andStopCntLessThan(Integer value) {
            addCriterion("stop_cnt <", value, "stopCnt");
            return (Criteria) this;
        }

        public Criteria andStopCntLessThanOrEqualTo(Integer value) {
            addCriterion("stop_cnt <=", value, "stopCnt");
            return (Criteria) this;
        }

        public Criteria andStopCntIn(List<Integer> values) {
            addCriterion("stop_cnt in", values, "stopCnt");
            return (Criteria) this;
        }

        public Criteria andStopCntNotIn(List<Integer> values) {
            addCriterion("stop_cnt not in", values, "stopCnt");
            return (Criteria) this;
        }

        public Criteria andStopCntBetween(Integer value1, Integer value2) {
            addCriterion("stop_cnt between", value1, value2, "stopCnt");
            return (Criteria) this;
        }

        public Criteria andStopCntNotBetween(Integer value1, Integer value2) {
            addCriterion("stop_cnt not between", value1, value2, "stopCnt");
            return (Criteria) this;
        }

        public Criteria andCabinIsNull() {
            addCriterion("cabin is null");
            return (Criteria) this;
        }

        public Criteria andCabinIsNotNull() {
            addCriterion("cabin is not null");
            return (Criteria) this;
        }

        public Criteria andCabinEqualTo(String value) {
            addCriterion("cabin =", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotEqualTo(String value) {
            addCriterion("cabin <>", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinGreaterThan(String value) {
            addCriterion("cabin >", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinGreaterThanOrEqualTo(String value) {
            addCriterion("cabin >=", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinLessThan(String value) {
            addCriterion("cabin <", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinLessThanOrEqualTo(String value) {
            addCriterion("cabin <=", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinLike(String value) {
            addCriterion("cabin like", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotLike(String value) {
            addCriterion("cabin not like", value, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinIn(List<String> values) {
            addCriterion("cabin in", values, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotIn(List<String> values) {
            addCriterion("cabin not in", values, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinBetween(String value1, String value2) {
            addCriterion("cabin between", value1, value2, "cabin");
            return (Criteria) this;
        }

        public Criteria andCabinNotBetween(String value1, String value2) {
            addCriterion("cabin not between", value1, value2, "cabin");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andDeptCityIsNull() {
            addCriterion("dept_city is null");
            return (Criteria) this;
        }

        public Criteria andDeptCityIsNotNull() {
            addCriterion("dept_city is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCityEqualTo(String value) {
            addCriterion("dept_city =", value, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityNotEqualTo(String value) {
            addCriterion("dept_city <>", value, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityGreaterThan(String value) {
            addCriterion("dept_city >", value, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityGreaterThanOrEqualTo(String value) {
            addCriterion("dept_city >=", value, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityLessThan(String value) {
            addCriterion("dept_city <", value, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityLessThanOrEqualTo(String value) {
            addCriterion("dept_city <=", value, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityLike(String value) {
            addCriterion("dept_city like", value, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityNotLike(String value) {
            addCriterion("dept_city not like", value, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityIn(List<String> values) {
            addCriterion("dept_city in", values, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityNotIn(List<String> values) {
            addCriterion("dept_city not in", values, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityBetween(String value1, String value2) {
            addCriterion("dept_city between", value1, value2, "deptCity");
            return (Criteria) this;
        }

        public Criteria andDeptCityNotBetween(String value1, String value2) {
            addCriterion("dept_city not between", value1, value2, "deptCity");
            return (Criteria) this;
        }

        public Criteria andArriCityIsNull() {
            addCriterion("arri_city is null");
            return (Criteria) this;
        }

        public Criteria andArriCityIsNotNull() {
            addCriterion("arri_city is not null");
            return (Criteria) this;
        }

        public Criteria andArriCityEqualTo(String value) {
            addCriterion("arri_city =", value, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityNotEqualTo(String value) {
            addCriterion("arri_city <>", value, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityGreaterThan(String value) {
            addCriterion("arri_city >", value, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityGreaterThanOrEqualTo(String value) {
            addCriterion("arri_city >=", value, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityLessThan(String value) {
            addCriterion("arri_city <", value, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityLessThanOrEqualTo(String value) {
            addCriterion("arri_city <=", value, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityLike(String value) {
            addCriterion("arri_city like", value, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityNotLike(String value) {
            addCriterion("arri_city not like", value, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityIn(List<String> values) {
            addCriterion("arri_city in", values, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityNotIn(List<String> values) {
            addCriterion("arri_city not in", values, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityBetween(String value1, String value2) {
            addCriterion("arri_city between", value1, value2, "arriCity");
            return (Criteria) this;
        }

        public Criteria andArriCityNotBetween(String value1, String value2) {
            addCriterion("arri_city not between", value1, value2, "arriCity");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeIsNull() {
            addCriterion("dept_airport_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeIsNotNull() {
            addCriterion("dept_airport_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeEqualTo(String value) {
            addCriterion("dept_airport_code =", value, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeNotEqualTo(String value) {
            addCriterion("dept_airport_code <>", value, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeGreaterThan(String value) {
            addCriterion("dept_airport_code >", value, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_airport_code >=", value, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeLessThan(String value) {
            addCriterion("dept_airport_code <", value, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_airport_code <=", value, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeLike(String value) {
            addCriterion("dept_airport_code like", value, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeNotLike(String value) {
            addCriterion("dept_airport_code not like", value, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeIn(List<String> values) {
            addCriterion("dept_airport_code in", values, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeNotIn(List<String> values) {
            addCriterion("dept_airport_code not in", values, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeBetween(String value1, String value2) {
            addCriterion("dept_airport_code between", value1, value2, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportCodeNotBetween(String value1, String value2) {
            addCriterion("dept_airport_code not between", value1, value2, "deptAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeIsNull() {
            addCriterion("arri_airport_code is null");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeIsNotNull() {
            addCriterion("arri_airport_code is not null");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeEqualTo(String value) {
            addCriterion("arri_airport_code =", value, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeNotEqualTo(String value) {
            addCriterion("arri_airport_code <>", value, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeGreaterThan(String value) {
            addCriterion("arri_airport_code >", value, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeGreaterThanOrEqualTo(String value) {
            addCriterion("arri_airport_code >=", value, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeLessThan(String value) {
            addCriterion("arri_airport_code <", value, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeLessThanOrEqualTo(String value) {
            addCriterion("arri_airport_code <=", value, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeLike(String value) {
            addCriterion("arri_airport_code like", value, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeNotLike(String value) {
            addCriterion("arri_airport_code not like", value, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeIn(List<String> values) {
            addCriterion("arri_airport_code in", values, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeNotIn(List<String> values) {
            addCriterion("arri_airport_code not in", values, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeBetween(String value1, String value2) {
            addCriterion("arri_airport_code between", value1, value2, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andArriAirportCodeNotBetween(String value1, String value2) {
            addCriterion("arri_airport_code not between", value1, value2, "arriAirportCode");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameIsNull() {
            addCriterion("dept_airport_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameIsNotNull() {
            addCriterion("dept_airport_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameEqualTo(String value) {
            addCriterion("dept_airport_name =", value, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameNotEqualTo(String value) {
            addCriterion("dept_airport_name <>", value, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameGreaterThan(String value) {
            addCriterion("dept_airport_name >", value, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_airport_name >=", value, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameLessThan(String value) {
            addCriterion("dept_airport_name <", value, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameLessThanOrEqualTo(String value) {
            addCriterion("dept_airport_name <=", value, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameLike(String value) {
            addCriterion("dept_airport_name like", value, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameNotLike(String value) {
            addCriterion("dept_airport_name not like", value, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameIn(List<String> values) {
            addCriterion("dept_airport_name in", values, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameNotIn(List<String> values) {
            addCriterion("dept_airport_name not in", values, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameBetween(String value1, String value2) {
            addCriterion("dept_airport_name between", value1, value2, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptAirportNameNotBetween(String value1, String value2) {
            addCriterion("dept_airport_name not between", value1, value2, "deptAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameIsNull() {
            addCriterion("arri_airport_name is null");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameIsNotNull() {
            addCriterion("arri_airport_name is not null");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameEqualTo(String value) {
            addCriterion("arri_airport_name =", value, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameNotEqualTo(String value) {
            addCriterion("arri_airport_name <>", value, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameGreaterThan(String value) {
            addCriterion("arri_airport_name >", value, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameGreaterThanOrEqualTo(String value) {
            addCriterion("arri_airport_name >=", value, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameLessThan(String value) {
            addCriterion("arri_airport_name <", value, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameLessThanOrEqualTo(String value) {
            addCriterion("arri_airport_name <=", value, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameLike(String value) {
            addCriterion("arri_airport_name like", value, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameNotLike(String value) {
            addCriterion("arri_airport_name not like", value, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameIn(List<String> values) {
            addCriterion("arri_airport_name in", values, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameNotIn(List<String> values) {
            addCriterion("arri_airport_name not in", values, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameBetween(String value1, String value2) {
            addCriterion("arri_airport_name between", value1, value2, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andArriAirportNameNotBetween(String value1, String value2) {
            addCriterion("arri_airport_name not between", value1, value2, "arriAirportName");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalIsNull() {
            addCriterion("dept_terminal is null");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalIsNotNull() {
            addCriterion("dept_terminal is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalEqualTo(String value) {
            addCriterion("dept_terminal =", value, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalNotEqualTo(String value) {
            addCriterion("dept_terminal <>", value, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalGreaterThan(String value) {
            addCriterion("dept_terminal >", value, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalGreaterThanOrEqualTo(String value) {
            addCriterion("dept_terminal >=", value, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalLessThan(String value) {
            addCriterion("dept_terminal <", value, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalLessThanOrEqualTo(String value) {
            addCriterion("dept_terminal <=", value, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalLike(String value) {
            addCriterion("dept_terminal like", value, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalNotLike(String value) {
            addCriterion("dept_terminal not like", value, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalIn(List<String> values) {
            addCriterion("dept_terminal in", values, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalNotIn(List<String> values) {
            addCriterion("dept_terminal not in", values, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalBetween(String value1, String value2) {
            addCriterion("dept_terminal between", value1, value2, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptTerminalNotBetween(String value1, String value2) {
            addCriterion("dept_terminal not between", value1, value2, "deptTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalIsNull() {
            addCriterion("arri_terminal is null");
            return (Criteria) this;
        }

        public Criteria andArriTerminalIsNotNull() {
            addCriterion("arri_terminal is not null");
            return (Criteria) this;
        }

        public Criteria andArriTerminalEqualTo(String value) {
            addCriterion("arri_terminal =", value, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalNotEqualTo(String value) {
            addCriterion("arri_terminal <>", value, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalGreaterThan(String value) {
            addCriterion("arri_terminal >", value, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalGreaterThanOrEqualTo(String value) {
            addCriterion("arri_terminal >=", value, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalLessThan(String value) {
            addCriterion("arri_terminal <", value, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalLessThanOrEqualTo(String value) {
            addCriterion("arri_terminal <=", value, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalLike(String value) {
            addCriterion("arri_terminal like", value, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalNotLike(String value) {
            addCriterion("arri_terminal not like", value, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalIn(List<String> values) {
            addCriterion("arri_terminal in", values, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalNotIn(List<String> values) {
            addCriterion("arri_terminal not in", values, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalBetween(String value1, String value2) {
            addCriterion("arri_terminal between", value1, value2, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andArriTerminalNotBetween(String value1, String value2) {
            addCriterion("arri_terminal not between", value1, value2, "arriTerminal");
            return (Criteria) this;
        }

        public Criteria andDeptDateIsNull() {
            addCriterion("dept_date is null");
            return (Criteria) this;
        }

        public Criteria andDeptDateIsNotNull() {
            addCriterion("dept_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeptDateEqualTo(String value) {
            addCriterion("dept_date =", value, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateNotEqualTo(String value) {
            addCriterion("dept_date <>", value, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateGreaterThan(String value) {
            addCriterion("dept_date >", value, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateGreaterThanOrEqualTo(String value) {
            addCriterion("dept_date >=", value, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateLessThan(String value) {
            addCriterion("dept_date <", value, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateLessThanOrEqualTo(String value) {
            addCriterion("dept_date <=", value, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateLike(String value) {
            addCriterion("dept_date like", value, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateNotLike(String value) {
            addCriterion("dept_date not like", value, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateIn(List<String> values) {
            addCriterion("dept_date in", values, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateNotIn(List<String> values) {
            addCriterion("dept_date not in", values, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateBetween(String value1, String value2) {
            addCriterion("dept_date between", value1, value2, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptDateNotBetween(String value1, String value2) {
            addCriterion("dept_date not between", value1, value2, "deptDate");
            return (Criteria) this;
        }

        public Criteria andDeptTimeIsNull() {
            addCriterion("dept_time is null");
            return (Criteria) this;
        }

        public Criteria andDeptTimeIsNotNull() {
            addCriterion("dept_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTimeEqualTo(String value) {
            addCriterion("dept_time =", value, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeNotEqualTo(String value) {
            addCriterion("dept_time <>", value, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeGreaterThan(String value) {
            addCriterion("dept_time >", value, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_time >=", value, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeLessThan(String value) {
            addCriterion("dept_time <", value, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeLessThanOrEqualTo(String value) {
            addCriterion("dept_time <=", value, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeLike(String value) {
            addCriterion("dept_time like", value, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeNotLike(String value) {
            addCriterion("dept_time not like", value, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeIn(List<String> values) {
            addCriterion("dept_time in", values, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeNotIn(List<String> values) {
            addCriterion("dept_time not in", values, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeBetween(String value1, String value2) {
            addCriterion("dept_time between", value1, value2, "deptTime");
            return (Criteria) this;
        }

        public Criteria andDeptTimeNotBetween(String value1, String value2) {
            addCriterion("dept_time not between", value1, value2, "deptTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeIsNull() {
            addCriterion("arri_time is null");
            return (Criteria) this;
        }

        public Criteria andArriTimeIsNotNull() {
            addCriterion("arri_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriTimeEqualTo(String value) {
            addCriterion("arri_time =", value, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeNotEqualTo(String value) {
            addCriterion("arri_time <>", value, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeGreaterThan(String value) {
            addCriterion("arri_time >", value, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeGreaterThanOrEqualTo(String value) {
            addCriterion("arri_time >=", value, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeLessThan(String value) {
            addCriterion("arri_time <", value, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeLessThanOrEqualTo(String value) {
            addCriterion("arri_time <=", value, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeLike(String value) {
            addCriterion("arri_time like", value, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeNotLike(String value) {
            addCriterion("arri_time not like", value, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeIn(List<String> values) {
            addCriterion("arri_time in", values, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeNotIn(List<String> values) {
            addCriterion("arri_time not in", values, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeBetween(String value1, String value2) {
            addCriterion("arri_time between", value1, value2, "arriTime");
            return (Criteria) this;
        }

        public Criteria andArriTimeNotBetween(String value1, String value2) {
            addCriterion("arri_time not between", value1, value2, "arriTime");
            return (Criteria) this;
        }

        public Criteria andFuelTaxIsNull() {
            addCriterion("fuel_tax is null");
            return (Criteria) this;
        }

        public Criteria andFuelTaxIsNotNull() {
            addCriterion("fuel_tax is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTaxEqualTo(Integer value) {
            addCriterion("fuel_tax =", value, "fuelTax");
            return (Criteria) this;
        }

        public Criteria andFuelTaxNotEqualTo(Integer value) {
            addCriterion("fuel_tax <>", value, "fuelTax");
            return (Criteria) this;
        }

        public Criteria andFuelTaxGreaterThan(Integer value) {
            addCriterion("fuel_tax >", value, "fuelTax");
            return (Criteria) this;
        }

        public Criteria andFuelTaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("fuel_tax >=", value, "fuelTax");
            return (Criteria) this;
        }

        public Criteria andFuelTaxLessThan(Integer value) {
            addCriterion("fuel_tax <", value, "fuelTax");
            return (Criteria) this;
        }

        public Criteria andFuelTaxLessThanOrEqualTo(Integer value) {
            addCriterion("fuel_tax <=", value, "fuelTax");
            return (Criteria) this;
        }

        public Criteria andFuelTaxIn(List<Integer> values) {
            addCriterion("fuel_tax in", values, "fuelTax");
            return (Criteria) this;
        }

        public Criteria andFuelTaxNotIn(List<Integer> values) {
            addCriterion("fuel_tax not in", values, "fuelTax");
            return (Criteria) this;
        }

        public Criteria andFuelTaxBetween(Integer value1, Integer value2) {
            addCriterion("fuel_tax between", value1, value2, "fuelTax");
            return (Criteria) this;
        }

        public Criteria andFuelTaxNotBetween(Integer value1, Integer value2) {
            addCriterion("fuel_tax not between", value1, value2, "fuelTax");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeIsNull() {
            addCriterion("construction_fee is null");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeIsNotNull() {
            addCriterion("construction_fee is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeEqualTo(Integer value) {
            addCriterion("construction_fee =", value, "constructionFee");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeNotEqualTo(Integer value) {
            addCriterion("construction_fee <>", value, "constructionFee");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeGreaterThan(Integer value) {
            addCriterion("construction_fee >", value, "constructionFee");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("construction_fee >=", value, "constructionFee");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeLessThan(Integer value) {
            addCriterion("construction_fee <", value, "constructionFee");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeLessThanOrEqualTo(Integer value) {
            addCriterion("construction_fee <=", value, "constructionFee");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeIn(List<Integer> values) {
            addCriterion("construction_fee in", values, "constructionFee");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeNotIn(List<Integer> values) {
            addCriterion("construction_fee not in", values, "constructionFee");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeBetween(Integer value1, Integer value2) {
            addCriterion("construction_fee between", value1, value2, "constructionFee");
            return (Criteria) this;
        }

        public Criteria andConstructionFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("construction_fee not between", value1, value2, "constructionFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeIsNull() {
            addCriterion("return_fee is null");
            return (Criteria) this;
        }

        public Criteria andReturnFeeIsNotNull() {
            addCriterion("return_fee is not null");
            return (Criteria) this;
        }

        public Criteria andReturnFeeEqualTo(Integer value) {
            addCriterion("return_fee =", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeNotEqualTo(Integer value) {
            addCriterion("return_fee <>", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeGreaterThan(Integer value) {
            addCriterion("return_fee >", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_fee >=", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeLessThan(Integer value) {
            addCriterion("return_fee <", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeLessThanOrEqualTo(Integer value) {
            addCriterion("return_fee <=", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeIn(List<Integer> values) {
            addCriterion("return_fee in", values, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeNotIn(List<Integer> values) {
            addCriterion("return_fee not in", values, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeBetween(Integer value1, Integer value2) {
            addCriterion("return_fee between", value1, value2, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("return_fee not between", value1, value2, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnTextIsNull() {
            addCriterion("return_text is null");
            return (Criteria) this;
        }

        public Criteria andReturnTextIsNotNull() {
            addCriterion("return_text is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTextEqualTo(String value) {
            addCriterion("return_text =", value, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextNotEqualTo(String value) {
            addCriterion("return_text <>", value, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextGreaterThan(String value) {
            addCriterion("return_text >", value, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextGreaterThanOrEqualTo(String value) {
            addCriterion("return_text >=", value, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextLessThan(String value) {
            addCriterion("return_text <", value, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextLessThanOrEqualTo(String value) {
            addCriterion("return_text <=", value, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextLike(String value) {
            addCriterion("return_text like", value, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextNotLike(String value) {
            addCriterion("return_text not like", value, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextIn(List<String> values) {
            addCriterion("return_text in", values, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextNotIn(List<String> values) {
            addCriterion("return_text not in", values, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextBetween(String value1, String value2) {
            addCriterion("return_text between", value1, value2, "returnText");
            return (Criteria) this;
        }

        public Criteria andReturnTextNotBetween(String value1, String value2) {
            addCriterion("return_text not between", value1, value2, "returnText");
            return (Criteria) this;
        }

        public Criteria andChangeFeeIsNull() {
            addCriterion("change_fee is null");
            return (Criteria) this;
        }

        public Criteria andChangeFeeIsNotNull() {
            addCriterion("change_fee is not null");
            return (Criteria) this;
        }

        public Criteria andChangeFeeEqualTo(Integer value) {
            addCriterion("change_fee =", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeNotEqualTo(Integer value) {
            addCriterion("change_fee <>", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeGreaterThan(Integer value) {
            addCriterion("change_fee >", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_fee >=", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeLessThan(Integer value) {
            addCriterion("change_fee <", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeLessThanOrEqualTo(Integer value) {
            addCriterion("change_fee <=", value, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeIn(List<Integer> values) {
            addCriterion("change_fee in", values, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeNotIn(List<Integer> values) {
            addCriterion("change_fee not in", values, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeBetween(Integer value1, Integer value2) {
            addCriterion("change_fee between", value1, value2, "changeFee");
            return (Criteria) this;
        }

        public Criteria andChangeFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("change_fee not between", value1, value2, "changeFee");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andOrderNoLikeInsensitive(String value) {
            addCriterion("upper(order_no) like", value.toUpperCase(), "orderNo");
            return this;
        }

        public Criteria andTicketNoLikeInsensitive(String value) {
            addCriterion("upper(ticket_no) like", value.toUpperCase(), "ticketNo");
            return this;
        }

        public Criteria andClientSiteLikeInsensitive(String value) {
            addCriterion("upper(client_site) like", value.toUpperCase(), "clientSite");
            return this;
        }

        public Criteria andFlightNumLikeInsensitive(String value) {
            addCriterion("upper(flight_num) like", value.toUpperCase(), "flightNum");
            return this;
        }

        public Criteria andActFlightNumLikeInsensitive(String value) {
            addCriterion("upper(act_flight_num) like", value.toUpperCase(), "actFlightNum");
            return this;
        }

        public Criteria andFlightTimeLikeInsensitive(String value) {
            addCriterion("upper(flight_time) like", value.toUpperCase(), "flightTime");
            return this;
        }

        public Criteria andCarrierCodeLikeInsensitive(String value) {
            addCriterion("upper(carrier_code) like", value.toUpperCase(), "carrierCode");
            return this;
        }

        public Criteria andCarrierNameLikeInsensitive(String value) {
            addCriterion("upper(carrier_name) like", value.toUpperCase(), "carrierName");
            return this;
        }

        public Criteria andCabinLikeInsensitive(String value) {
            addCriterion("upper(cabin) like", value.toUpperCase(), "cabin");
            return this;
        }

        public Criteria andTagLikeInsensitive(String value) {
            addCriterion("upper(tag) like", value.toUpperCase(), "tag");
            return this;
        }

        public Criteria andDeptCityLikeInsensitive(String value) {
            addCriterion("upper(dept_city) like", value.toUpperCase(), "deptCity");
            return this;
        }

        public Criteria andArriCityLikeInsensitive(String value) {
            addCriterion("upper(arri_city) like", value.toUpperCase(), "arriCity");
            return this;
        }

        public Criteria andDeptAirportCodeLikeInsensitive(String value) {
            addCriterion("upper(dept_airport_code) like", value.toUpperCase(), "deptAirportCode");
            return this;
        }

        public Criteria andArriAirportCodeLikeInsensitive(String value) {
            addCriterion("upper(arri_airport_code) like", value.toUpperCase(), "arriAirportCode");
            return this;
        }

        public Criteria andDeptAirportNameLikeInsensitive(String value) {
            addCriterion("upper(dept_airport_name) like", value.toUpperCase(), "deptAirportName");
            return this;
        }

        public Criteria andArriAirportNameLikeInsensitive(String value) {
            addCriterion("upper(arri_airport_name) like", value.toUpperCase(), "arriAirportName");
            return this;
        }

        public Criteria andDeptTerminalLikeInsensitive(String value) {
            addCriterion("upper(dept_terminal) like", value.toUpperCase(), "deptTerminal");
            return this;
        }

        public Criteria andArriTerminalLikeInsensitive(String value) {
            addCriterion("upper(arri_terminal) like", value.toUpperCase(), "arriTerminal");
            return this;
        }

        public Criteria andDeptDateLikeInsensitive(String value) {
            addCriterion("upper(dept_date) like", value.toUpperCase(), "deptDate");
            return this;
        }

        public Criteria andDeptTimeLikeInsensitive(String value) {
            addCriterion("upper(dept_time) like", value.toUpperCase(), "deptTime");
            return this;
        }

        public Criteria andArriTimeLikeInsensitive(String value) {
            addCriterion("upper(arri_time) like", value.toUpperCase(), "arriTime");
            return this;
        }

        public Criteria andReturnTextLikeInsensitive(String value) {
            addCriterion("upper(return_text) like", value.toUpperCase(), "returnText");
            return this;
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}