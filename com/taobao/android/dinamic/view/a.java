package com.taobao.android.dinamic.view;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_CODE_BYTE_READ_ERROR = "byteReadError";
    public static final String ERROR_CODE_BYTE_TO_PARSER_ERROR = "byteToParserError";
    public static final String ERROR_CODE_EVENT_HANDLER_EXCEPTION = "eventHandlerException";
    public static final String ERROR_CODE_EVENT_HANDLER_NOT_FOUND = "eventHandlerNotFound";
    public static final String ERROR_CODE_OTHER = "other";
    public static final String ERROR_CODE_TEMPLATE_FILE_EMPTY = "templateFileEmpty";
    public static final String ERROR_CODE_TEMPLATE_FILE_LOST = "templateFileLost";
    public static final String ERROR_CODE_TEMPLATE_INFO_ERROR = "templateInfoError";
    public static final String ERROR_CODE_TEMPLATE_NOT_FOUND = "templateNotFound";
    public static final String ERROR_CODE_TEMPLATE_PARSER_EXCEPTION = "parserException";
    public static final String ERROR_CODE_TEMPLATE_PARSER_NOT_FOUND = "parserNotFound";
    public static final String ERROR_CODE_VIEW_EXCEPTION = "viewException";
    public static final String ERROR_CODE_VIEW_NOT_FOUND = "viewNotFound";
    public static final String ERROR_CODE_XML_BLOCK_CONSTRUCTOR_REFLECT_ERROR = "xmlBlockConstructorReflectError";
    public static final String ERROR_CODE_XML_RES_PARSER_ERROR = "xmlResourceParserError";

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, String> f11772a = new HashMap<>();
    private String b;

    static {
        kge.a(-1316362992);
    }

    public a(String str) {
        this.b = str;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f11772a.isEmpty();
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        if (!this.f11772a.containsKey(str)) {
            HashMap<String, String> hashMap = this.f11772a;
            hashMap.put(str, this.b + ":" + str2 + ";");
        }
        HashMap<String, String> hashMap2 = this.f11772a;
        hashMap2.put(str, this.f11772a.get(str) + str2 + ";");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f11772a.toString();
    }

    public HashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("52df8a4d", new Object[]{this}) : this.f11772a;
    }
}
