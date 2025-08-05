package com.taobao.themis.open.ability.network;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoConstants;
import java.util.HashMap;
import java.util.Map;
import tb.icf;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERR_CONNECT_FAILED = "ERR_CONNECT_FAILED";
    public static final String ERR_INVALID_REQUEST = "ERR_INVALID_REQUEST";
    public static final String UNKNOWN_STATUS = "unknown status";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f22662a;

    static {
        kge.a(-1116877017);
        HashMap hashMap = new HashMap();
        f22662a = hashMap;
        hashMap.put("100", "Continue");
        f22662a.put("101", "Switching Protocol");
        f22662a.put("200", icf.a.CONTROL_NAME_OK);
        f22662a.put("201", "Created");
        f22662a.put("202", "Accepted");
        f22662a.put("203", "Non-Authoritative Information");
        f22662a.put("204", "No Content");
        f22662a.put("205", "Reset Content");
        f22662a.put("206", "Partial Content");
        f22662a.put("300", "Multiple Choice");
        f22662a.put("301", "Moved Permanently");
        f22662a.put("302", "Found");
        f22662a.put("303", "See Other");
        f22662a.put("304", "Not Modified");
        f22662a.put("305", "Use Proxy");
        f22662a.put("306", "unused");
        f22662a.put("307", "Temporary Redirect");
        f22662a.put("308", "Permanent Redirect");
        f22662a.put("400", "Bad Request");
        f22662a.put("401", "Unauthorized");
        f22662a.put("402", "Payment Required");
        f22662a.put("403", "Forbidden");
        f22662a.put("404", "Not Found");
        f22662a.put("405", "Method Not Allowed");
        f22662a.put("406", "Not Acceptable");
        f22662a.put("407", "Proxy Authentication Required");
        f22662a.put("408", "Request Timeout");
        f22662a.put("409", "Conflict");
        f22662a.put("410", "Gone");
        f22662a.put("411", "Length Required");
        f22662a.put("412", "Precondition Failed");
        f22662a.put("413", "Payload Too Large");
        f22662a.put("414", "URI Too Long");
        f22662a.put("415", "Unsupported Media Type");
        f22662a.put("416", "Requested Range Not Satisfiable");
        f22662a.put("417", "Expectation Failed");
        f22662a.put("418", "I'm a teapot");
        f22662a.put("421", "Misdirected Request");
        f22662a.put("426", "Upgrade Required");
        f22662a.put("428", "Precondition Required");
        f22662a.put("429", "Too Many Requests");
        f22662a.put("431", "Request Header Fields Too Large");
        f22662a.put("500", "Internal Server Error");
        f22662a.put("501", "Not Implemented");
        f22662a.put("502", "Bad Gateway");
        f22662a.put("503", "Service Unavailable");
        f22662a.put(TaobaoConstants.DEVICETOKEN_ERROR, "Gateway Timeout");
        f22662a.put("505", "HTTP Version Not Supported");
        f22662a.put("506", "Variant Also Negotiates");
        f22662a.put("507", "Variant Also Negotiates");
        f22662a.put("511", "Network Authentication Required");
    }

    public static String a(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        } else if (!f22662a.containsKey(str)) {
            return "unknown status";
        } else {
            obj = f22662a.get(str);
        }
        return (String) obj;
    }
}
