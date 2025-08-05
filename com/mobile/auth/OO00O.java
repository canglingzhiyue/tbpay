package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.nirvana.tools.jsoner.JsonerTag;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class OO00O {
    public static final SimpleDateFormat POP_REQUEST_DATE_FORMAT;
    public static final SimpleDateFormat REQUEST_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @JsonerTag(keyName = "Action")
    private String Action;
    private String accessKeySecret;
    private String baseUrl;
    protected String requestMethod;
    private String sign;
    protected String method = null;
    @JsonerTag(keyName = "Timestamp")
    private String timestamp = POP_REQUEST_DATE_FORMAT.format(new Date());
    protected boolean isSign = true;
    @JsonerTag(keyName = "SignatureMethod")
    private String signatureMethod = "HMAC-SHA1";
    @JsonerTag(keyName = "SignatureNonce")
    private String SignatureNonce = UUID.randomUUID().toString();
    @JsonerTag(keyName = "SignatureVersion")
    private String SignatureVersion = "1.0";

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        POP_REQUEST_DATE_FORMAT = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("O"));
    }

    public String buildPopRequestParamas() {
        try {
            List<Field> O000000o = OO00O0o.O000000o(getClass());
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            TreeMap treeMap = new TreeMap();
            for (Field field : O000000o) {
                JsonerTag jsonerTag = (JsonerTag) field.getAnnotation(JsonerTag.class);
                if (jsonerTag != null) {
                    String keyName = jsonerTag.keyName();
                    field.setAccessible(true);
                    try {
                        Object obj = field.get(this);
                        if (obj != null) {
                            treeMap.put(keyName, obj);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                sb2.append("&");
                sb2.append(OO00O0o.O000000o((String) entry.getKey()));
                sb2.append("=");
                sb2.append(OO00O0o.O000000o(entry.getValue() == null ? "" : entry.getValue().toString()));
            }
            sb.append("POST");
            sb.append("&");
            sb.append(OO00O0o.O000000o("/"));
            sb.append("&");
            sb.append(OO00O0o.O000000o(sb2.toString().substring(1)));
            if (!isSign()) {
                sb2.toString();
                return sb2.toString();
            }
            String O000000o2 = OO00O0o.O000000o(OO00O0o.O000000o(sb, this.accessKeySecret + "&"));
            return ((Object) sb2) + "&Signature=" + O000000o2;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String getAccessKeySecret() {
        try {
            return this.accessKeySecret;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String getAction() {
        try {
            return this.Action;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String getBaseUrl() {
        try {
            return this.baseUrl;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String getMethod() {
        try {
            return this.method;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String getRequestMethod() {
        try {
            return this.requestMethod;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String getSign() {
        try {
            return this.sign;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public boolean isSign() {
        try {
            return this.isSign;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public void setAccessKeySecret(String str) {
        try {
            this.accessKeySecret = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setAction(String str) {
        try {
            this.Action = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setBaseUrl(String str) {
        try {
            this.baseUrl = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setMethod(String str) {
        try {
            this.method = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setRequestMethod(String str) {
        try {
            this.requestMethod = str;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void setSign(boolean z) {
        try {
            this.isSign = z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
