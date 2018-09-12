package com.hnguigu.oa.domain;

import java.util.ArrayList;
import java.util.List;

public class OaPrivilegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OaPrivilegeExample() {
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
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

        public Criteria andPrivilegeIdIsNull() {
            addCriterion("privilege_id is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdIsNotNull() {
            addCriterion("privilege_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdEqualTo(Integer value) {
            addCriterion("privilege_id =", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdNotEqualTo(Integer value) {
            addCriterion("privilege_id <>", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdGreaterThan(Integer value) {
            addCriterion("privilege_id >", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("privilege_id >=", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdLessThan(Integer value) {
            addCriterion("privilege_id <", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("privilege_id <=", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdIn(List<Integer> values) {
            addCriterion("privilege_id in", values, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdNotIn(List<Integer> values) {
            addCriterion("privilege_id not in", values, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdBetween(Integer value1, Integer value2) {
            addCriterion("privilege_id between", value1, value2, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("privilege_id not between", value1, value2, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameIsNull() {
            addCriterion("privilege_name is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameIsNotNull() {
            addCriterion("privilege_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameEqualTo(String value) {
            addCriterion("privilege_name =", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameNotEqualTo(String value) {
            addCriterion("privilege_name <>", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameGreaterThan(String value) {
            addCriterion("privilege_name >", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("privilege_name >=", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameLessThan(String value) {
            addCriterion("privilege_name <", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameLessThanOrEqualTo(String value) {
            addCriterion("privilege_name <=", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameLike(String value) {
            addCriterion("privilege_name like", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameNotLike(String value) {
            addCriterion("privilege_name not like", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameIn(List<String> values) {
            addCriterion("privilege_name in", values, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameNotIn(List<String> values) {
            addCriterion("privilege_name not in", values, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameBetween(String value1, String value2) {
            addCriterion("privilege_name between", value1, value2, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameNotBetween(String value1, String value2) {
            addCriterion("privilege_name not between", value1, value2, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlIsNull() {
            addCriterion("privilege_url is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlIsNotNull() {
            addCriterion("privilege_url is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlEqualTo(String value) {
            addCriterion("privilege_url =", value, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlNotEqualTo(String value) {
            addCriterion("privilege_url <>", value, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlGreaterThan(String value) {
            addCriterion("privilege_url >", value, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("privilege_url >=", value, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlLessThan(String value) {
            addCriterion("privilege_url <", value, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlLessThanOrEqualTo(String value) {
            addCriterion("privilege_url <=", value, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlLike(String value) {
            addCriterion("privilege_url like", value, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlNotLike(String value) {
            addCriterion("privilege_url not like", value, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlIn(List<String> values) {
            addCriterion("privilege_url in", values, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlNotIn(List<String> values) {
            addCriterion("privilege_url not in", values, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlBetween(String value1, String value2) {
            addCriterion("privilege_url between", value1, value2, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeUrlNotBetween(String value1, String value2) {
            addCriterion("privilege_url not between", value1, value2, "privilegeUrl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelIsNull() {
            addCriterion("privilege_level is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelIsNotNull() {
            addCriterion("privilege_level is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelEqualTo(Integer value) {
            addCriterion("privilege_level =", value, "privilegeLevel");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelNotEqualTo(Integer value) {
            addCriterion("privilege_level <>", value, "privilegeLevel");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelGreaterThan(Integer value) {
            addCriterion("privilege_level >", value, "privilegeLevel");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("privilege_level >=", value, "privilegeLevel");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelLessThan(Integer value) {
            addCriterion("privilege_level <", value, "privilegeLevel");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelLessThanOrEqualTo(Integer value) {
            addCriterion("privilege_level <=", value, "privilegeLevel");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelIn(List<Integer> values) {
            addCriterion("privilege_level in", values, "privilegeLevel");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelNotIn(List<Integer> values) {
            addCriterion("privilege_level not in", values, "privilegeLevel");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelBetween(Integer value1, Integer value2) {
            addCriterion("privilege_level between", value1, value2, "privilegeLevel");
            return (Criteria) this;
        }

        public Criteria andPrivilegeLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("privilege_level not between", value1, value2, "privilegeLevel");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafIsNull() {
            addCriterion("privilege_is_leaf is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafIsNotNull() {
            addCriterion("privilege_is_leaf is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafEqualTo(String value) {
            addCriterion("privilege_is_leaf =", value, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafNotEqualTo(String value) {
            addCriterion("privilege_is_leaf <>", value, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafGreaterThan(String value) {
            addCriterion("privilege_is_leaf >", value, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafGreaterThanOrEqualTo(String value) {
            addCriterion("privilege_is_leaf >=", value, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafLessThan(String value) {
            addCriterion("privilege_is_leaf <", value, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafLessThanOrEqualTo(String value) {
            addCriterion("privilege_is_leaf <=", value, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafLike(String value) {
            addCriterion("privilege_is_leaf like", value, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafNotLike(String value) {
            addCriterion("privilege_is_leaf not like", value, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafIn(List<String> values) {
            addCriterion("privilege_is_leaf in", values, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafNotIn(List<String> values) {
            addCriterion("privilege_is_leaf not in", values, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafBetween(String value1, String value2) {
            addCriterion("privilege_is_leaf between", value1, value2, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsLeafNotBetween(String value1, String value2) {
            addCriterion("privilege_is_leaf not between", value1, value2, "privilegeIsLeaf");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleIsNull() {
            addCriterion("privilege_is_module is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleIsNotNull() {
            addCriterion("privilege_is_module is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleEqualTo(String value) {
            addCriterion("privilege_is_module =", value, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleNotEqualTo(String value) {
            addCriterion("privilege_is_module <>", value, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleGreaterThan(String value) {
            addCriterion("privilege_is_module >", value, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleGreaterThanOrEqualTo(String value) {
            addCriterion("privilege_is_module >=", value, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleLessThan(String value) {
            addCriterion("privilege_is_module <", value, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleLessThanOrEqualTo(String value) {
            addCriterion("privilege_is_module <=", value, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleLike(String value) {
            addCriterion("privilege_is_module like", value, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleNotLike(String value) {
            addCriterion("privilege_is_module not like", value, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleIn(List<String> values) {
            addCriterion("privilege_is_module in", values, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleNotIn(List<String> values) {
            addCriterion("privilege_is_module not in", values, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleBetween(String value1, String value2) {
            addCriterion("privilege_is_module between", value1, value2, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIsModuleNotBetween(String value1, String value2) {
            addCriterion("privilege_is_module not between", value1, value2, "privilegeIsModule");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeIsNull() {
            addCriterion("privilege_code is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeIsNotNull() {
            addCriterion("privilege_code is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeEqualTo(String value) {
            addCriterion("privilege_code =", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeNotEqualTo(String value) {
            addCriterion("privilege_code <>", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeGreaterThan(String value) {
            addCriterion("privilege_code >", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("privilege_code >=", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeLessThan(String value) {
            addCriterion("privilege_code <", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeLessThanOrEqualTo(String value) {
            addCriterion("privilege_code <=", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeLike(String value) {
            addCriterion("privilege_code like", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeNotLike(String value) {
            addCriterion("privilege_code not like", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeIn(List<String> values) {
            addCriterion("privilege_code in", values, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeNotIn(List<String> values) {
            addCriterion("privilege_code not in", values, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeBetween(String value1, String value2) {
            addCriterion("privilege_code between", value1, value2, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeNotBetween(String value1, String value2) {
            addCriterion("privilege_code not between", value1, value2, "privilegeCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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

        private String typeHandler;

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

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}