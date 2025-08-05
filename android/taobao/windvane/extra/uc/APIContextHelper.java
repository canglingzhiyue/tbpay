package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.config.a;
import android.util.Base64;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.alu;
import tb.kge;

/* loaded from: classes2.dex */
public class APIContextHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-849465343);
    }

    public static /* synthetic */ String access$000(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ccb44f66", new Object[]{uri, str}) : getAPICallRecordsInternal(uri, str);
    }

    public static String getAPICallRecords(String str) {
        final String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab9bfdaf", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            final Uri parse = Uri.parse(str);
            if (parse == null || (queryParameter = parse.getQueryParameter("api-info")) == null) {
                return null;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                return getAPICallRecordsInternal(parse, queryParameter);
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final String[] strArr = {null};
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: android.taobao.windvane.extra.uc.APIContextHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    strArr[0] = APIContextHelper.access$000(parse, queryParameter);
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(1L, TimeUnit.SECONDS);
                return strArr[0];
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getAPICallRecordsInternal(Uri uri, String str) {
        String string;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f22dd4d3", new Object[]{uri, str});
        }
        try {
            JSONArray parseArray = JSONArray.parseArray(new String(Base64.decode(str, 0)));
            if (parseArray != null) {
                JSONArray jSONArray = new JSONArray();
                alu aluVar = new alu(new alr("WindVane", "WindVane").a((Context) a.f));
                Iterator<Object> it = parseArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) next;
                        if (jSONArray2.size() < 2 || (string = jSONArray2.getString(0)) == null || (split = string.split("\\.")) == null || split.length < 2) {
                            return null;
                        }
                        try {
                            alq alqVar = new alq();
                            alqVar.a("url", uri.toString());
                            ExecuteResult a2 = aluVar.a(split[0], split[1], alqVar, jSONArray2.getJSONObject(1), new alo() { // from class: android.taobao.windvane.extra.uc.APIContextHelper.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // tb.alo
                                public void onCallback(ExecuteResult executeResult) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                                    }
                                }
                            });
                            if (a2 != null) {
                                jSONArray2.add(a2.c());
                                jSONArray.add(jSONArray2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (jSONArray.size() > 0) {
                    return jSONArray.toJSONString();
                }
            }
        } catch (Throwable unused2) {
        }
        return null;
    }
}
