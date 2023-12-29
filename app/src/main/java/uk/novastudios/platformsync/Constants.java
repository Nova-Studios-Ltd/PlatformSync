package uk.novastudios.platformsync;

public class Constants {
    public static final String YTM_DOMAIN = "https://music.youtube.com";
    public static final String YTM_BASE_API = YTM_DOMAIN + "/youtubei/v1/";
    public static final String YTM_PARAMS = "?alt=json";
    public static final String YTM_PARAMS_KEY = "&key=AIzaSyC9XL3ZjWddXya6X74dJoCTL-WEYFDNX30";
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:88.0) Gecko/20100101 Firefox/88.0";

    public static final String[] SUPPORTED_LANGUAGES = {
        "ar", "de", "en", "es", "fr", "hi", "it", "ja", "ko", "nl", "pt", "ru", "tr", "ur", "zh_CN",
                "zh_TW"
    };

    public static final String[] SUPPORTED_LOCATIONS = {
        "AE", "AR", "AT", "AU", "AZ", "BA", "BD", "BE", "BG", "BH", "BO", "BR", "BY", "CA", "CH", "CL",
                "CO", "CR", "CY", "CZ", "DE", "DK", "DO", "DZ", "EC", "EE", "EG", "ES", "FI", "FR", "GB", "GE",
                "GH", "GR", "GT", "HK", "HN", "HR", "HU", "ID", "IE", "IL", "IN", "IQ", "IS", "IT", "JM", "JO",
                "JP", "KE", "KH", "KR", "KW", "KZ", "LA", "LB", "LI", "LK", "LT", "LU", "LV", "LY", "MA", "ME",
                "MK", "MT", "MX", "MY", "NG", "NI", "NL", "NO", "NP", "NZ", "OM", "PA", "PE", "PG", "PH", "PK",
                "PL", "PR", "PT", "PY", "QA", "RO", "RS", "RU", "SA", "SE", "SG", "SI", "SK", "SN", "SV", "TH",
                "TN", "TR", "TW", "TZ", "UA", "UG", "US", "UY", "VE", "VN", "YE", "ZA", "ZW"
    };
    public static final String OAUTH_CLIENT_ID = "861556708454-d6dlm3lh05idd8npek18k6be8ba3oc68.apps.googleusercontent.com";
    public static final String OAUTH_CLIENT_SECRET = "SboVhoG9s0rNafixCSGGKXAT";
    public static final String OAUTH_SCOPE = "https://www.googleapis.com/auth/youtube";
    public static final String OAUTH_CODE_URL = "https://www.youtube.com/o/oauth2/device/code";
    public static final String OAUTH_TOKEN_URL = "https://oauth2.googleapis.com/token";
    public static final String OAUTH_USER_AGENT = USER_AGENT + " Cobalt/Version";
}
