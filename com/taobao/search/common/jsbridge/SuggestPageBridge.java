package com.taobao.search.common.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import tb.kge;
import tb.nrn;

/* loaded from: classes7.dex */
public final class SuggestPageBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ACTIVATE = "getActivateData";
    public static final String ACTION_BG_WORDS = "getBGWordsData";
    public static final String ACTION_SUGGEST = "getSuggestData";
    public static final String API_NAME = "TBSearchSuggestBridge";
    public static final a Companion;

    static {
        kge.a(1501211119);
        Companion = new a(null);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1039255945);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject != null && str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 431298995) {
                if (hashCode != 1195718168) {
                    if (hashCode == 2128263192 && str.equals(ACTION_SUGGEST)) {
                        try {
                            int intValue = parseObject.getIntValue("searchSuggestPageId");
                            if (intValue <= 0) {
                                return false;
                            }
                            r rVar = new r();
                            rVar.a("data", nrn.a().f(Integer.valueOf(intValue)));
                            if (wVCallBackContext != null) {
                                wVCallBackContext.success(rVar);
                            }
                            return true;
                        } catch (Exception unused) {
                            return false;
                        }
                    }
                } else if (str.equals(ACTION_BG_WORDS)) {
                    try {
                        int intValue2 = parseObject.getIntValue("searchDoorPageId");
                        if (intValue2 <= 0) {
                            return false;
                        }
                        r rVar2 = new r();
                        rVar2.a("data", nrn.a().b(Integer.valueOf(intValue2)));
                        if (wVCallBackContext != null) {
                            wVCallBackContext.success(rVar2);
                        }
                        return true;
                    } catch (Exception unused2) {
                        return false;
                    }
                }
            } else if (str.equals(ACTION_ACTIVATE)) {
                try {
                    int intValue3 = parseObject.getIntValue("searchDoorPageId");
                    if (intValue3 <= 0) {
                        return false;
                    }
                    r rVar3 = new r();
                    rVar3.a("data", nrn.a().d(Integer.valueOf(intValue3)));
                    if (wVCallBackContext != null) {
                        wVCallBackContext.success(rVar3);
                    }
                    return true;
                } catch (Exception unused3) {
                }
            }
        }
        return false;
    }
}
