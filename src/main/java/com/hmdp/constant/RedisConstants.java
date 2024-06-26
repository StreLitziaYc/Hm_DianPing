package com.hmdp.constant;

public class RedisConstants {
    public static final String LOGIN_CODE_KEY = "login:code:";
    public static final Long LOGIN_CODE_TTL = 2L;
    public static final String LOGIN_USER_KEY = "login:token:";
    public static final Long LOGIN_USER_TTL = 30L;
    public static final String NULL_KEY = "";
    public static final String NULL_VALUE = "";
    public static final Long CACHE_NULL_TTL = 2L;
    public static final String ORDER_ID_PREFIX = "order:";
    public static final Long CACHE_SHOP_TTL = 30L;
    public static final String CACHE_SHOP_KEY = "cache:shop:";
    public static final String LOGICAL_CASH_SHOP_KEY = "logical:cache:shop:";
    public static final String CACHE_SHOP_TYPE_KEY = "cache:shop:type";
    public static final String LOCK_KEY = "lock:";
    public static final String LOCK_VALUE = "1";
    public static final Long LOCK_SHOP_TTL = 10L;
    public static final String FOLLOW_KEY = "follow:";
    public static final String SECKILL_STOCK_KEY = "seckill:stock:";
    public static final String SECKILL_ORDER_KEY = "seckill:order:";
    public static final String BLOG_LIKED_KEY = "blog:liked:";
    public static final String FEED_KEY = "feed:";
    public static final String SHOP_GEO_KEY = "shop:geo:";
    public static final String USER_SIGN_KEY = "sign:";
    public static final Long BLOG_COUNT = 3L;
}
