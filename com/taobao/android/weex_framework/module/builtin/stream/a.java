package com.taobao.android.weex_framework.module.builtin.stream;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoConstants;
import java.util.HashMap;
import java.util.Map;
import tb.icf;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERR_CONNECT_FAILED = "ERR_CONNECT_FAILED";
    public static final String ERR_INVALID_REQUEST = "ERR_INVALID_REQUEST";
    public static final String UNKNOWN_STATUS = "unknown status";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f16061a;

    static {
        kge.a(-2079181586);
        HashMap hashMap = new HashMap();
        f16061a = hashMap;
        hashMap.put("100", "Continue");
        f16061a.put("101", "Switching Protocol");
        f16061a.put("200", icf.a.CONTROL_NAME_OK);
        f16061a.put("201", "Created");
        f16061a.put("202", "Accepted");
        f16061a.put("203", "Non-Authoritative Information");
        f16061a.put("204", "No Content");
        f16061a.put("205", "Reset Content");
        f16061a.put("206", "Partial Content");
        f16061a.put("300", "Multiple Choice");
        f16061a.put("301", "Moved Permanently");
        f16061a.put("302", "Found");
        f16061a.put("303", "See Other");
        f16061a.put("304", "Not Modified");
        f16061a.put("305", "Use Proxy");
        f16061a.put("306", "unused");
        f16061a.put("307", "Temporary Redirect");
        f16061a.put("308", "Permanent Redirect");
        f16061a.put("400", "Bad Request");
        f16061a.put("401", "Unauthorized");
        f16061a.put("402", "Payment Required");
        f16061a.put("403", "Forbidden");
        f16061a.put("404", "Not Found");
        f16061a.put("405", "Method Not Allowed");
        f16061a.put("406", "Not Acceptable");
        f16061a.put("407", "Proxy Authentication Required");
        f16061a.put("408", "Request Timeout");
        f16061a.put("409", "Conflict");
        f16061a.put("410", "Gone");
        f16061a.put("411", "Length Required");
        f16061a.put("412", "Precondition Failed");
        f16061a.put("413", "Payload Too Large");
        f16061a.put("414", "URI Too Long");
        f16061a.put("415", "Unsupported Media Type");
        f16061a.put("416", "Requested Range Not Satisfiable");
        f16061a.put("417", "Expectation Failed");
        f16061a.put("418", "I'm a teapot");
        f16061a.put("421", "Misdirected Request");
        f16061a.put("426", "Upgrade Required");
        f16061a.put("428", "Precondition Required");
        f16061a.put("429", "Too Many Requests");
        f16061a.put("431", "Request Header Fields Too Large");
        f16061a.put("500", "Internal Server Error");
        f16061a.put("501", "Not Implemented");
        f16061a.put("502", "Bad Gateway");
        f16061a.put("503", "Service Unavailable");
        f16061a.put(TaobaoConstants.DEVICETOKEN_ERROR, "Gateway Timeout");
        f16061a.put("505", "HTTP Version Not Supported");
        f16061a.put("506", "Variant Also Negotiates");
        f16061a.put("507", "Variant Also Negotiates");
        f16061a.put("511", "Network Authentication Required");
    }

    public static String a(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        } else if (!f16061a.containsKey(str)) {
            return "unknown status";
        } else {
            obj = f16061a.get(str);
        }
        return (String) obj;
    }
}
