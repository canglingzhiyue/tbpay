package tb;

import android.os.Environment;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.aliweex.adapter.adapter.WXExceptionAdapter;
import com.alibaba.aliweex.d;
import com.alibaba.aliweex.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.performance.c;
import com.taobao.weex.performance.f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aks;

/* loaded from: classes2.dex */
public class and implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_STAGE_JS_ASYNC_DATA_END = "wxJSAsyncDataEnd";
    public static final String KEY_STAGE_JS_ASYNC_DATA_START = "wxJSAsyncDataStart";
    public static boolean b;
    private static int d;
    private static boolean e;

    /* renamed from: a  reason: collision with root package name */
    public String f25450a;
    private mqc c;
    private TextView f;
    private Map<String, Double> g = new ConcurrentHashMap();
    private String h;
    private boolean i;

    public static /* synthetic */ TextView a(and andVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("c25da715", new Object[]{andVar}) : andVar.f;
    }

    public static /* synthetic */ TextView a(and andVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("ef9b8b37", new Object[]{andVar, textView});
        }
        andVar.f = textView;
        return textView;
    }

    public static /* synthetic */ String b(and andVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("834264be", new Object[]{andVar}) : andVar.f();
    }

    static {
        kge.a(-1336002397);
        kge.a(164134147);
        d = -2;
        e = true;
        b = false;
    }

    @Override // com.taobao.weex.performance.c
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || this.i) {
        } else {
            this.f25450a = str;
            this.c = mpy.b().a();
            mqc mqcVar = this.c;
            if (mqcVar == null) {
                return;
            }
            mqcVar.b(str);
            d();
            this.i = true;
        }
    }

    @Override // com.taobao.weex.performance.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        mqc mqcVar = this.c;
        if (mqcVar == null) {
            return;
        }
        mqcVar.c();
    }

    @Override // com.taobao.weex.performance.c
    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        mqc mqcVar = this.c;
        if (mqcVar != null) {
            mqcVar.a(str, j);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("weexInstanceId", StringUtils.isEmpty(this.f25450a) ? "nullId" : this.f25450a);
        if (!StringUtils.isEmpty(this.h)) {
            hashMap.put("mPageName", this.h);
        }
        d.a().a(str, hashMap);
        if (!b) {
            return;
        }
        e();
    }

    @Override // com.taobao.weex.performance.c
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        mqc mqcVar = this.c;
        if (mqcVar == null) {
            return;
        }
        mqcVar.a(str, obj);
        if (!b || !"wxBizID".equals(str)) {
            return;
        }
        this.h = obj.toString();
    }

    @Override // com.taobao.weex.performance.c
    public void a(String str, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81239a4c", new Object[]{this, str, new Double(d2)});
            return;
        }
        mqc mqcVar = this.c;
        if (mqcVar == null) {
            return;
        }
        mqcVar.a(str, d2);
        if (!b) {
            return;
        }
        this.g.put(str, Double.valueOf(d2));
        if (!f.KEY_PAGE_STATS_LAYOUT_TIME.equals(str)) {
            return;
        }
        g();
    }

    @Override // com.taobao.weex.performance.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        mqc mqcVar = this.c;
        if (mqcVar == null) {
            return;
        }
        mqcVar.d();
    }

    @Override // com.taobao.weex.performance.c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        mqc mqcVar = this.c;
        if (mqcVar == null) {
            return;
        }
        mqcVar.e();
    }

    @Override // com.taobao.weex.performance.c
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String realNameFromNameOrUrl = WXExceptionAdapter.getRealNameFromNameOrUrl(str, false);
        return StringUtils.isEmpty(realNameFromNameOrUrl) ? "emptyParseUrl" : realNameFromNameOrUrl;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        e l = d.a().l();
        if (l == null || !Boolean.valueOf(l.getConfig("wxapm", "collectDeviceLevel", "true")).booleanValue()) {
            return;
        }
        if (d == -2) {
            if (e) {
                try {
                    aks.d g = aks.a().g();
                    d = g == null ? -1 : g.f25407a;
                } catch (Throwable unused) {
                    e = false;
                    d = -1;
                }
            } else {
                d = -1;
            }
        }
        a("wxDeviceLevel", Integer.valueOf(d + 1));
    }

    private void e() {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!b || (wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(this.f25450a)) == null) {
        } else {
            final View am = wXSDKInstance.am();
            if (!(am instanceof FrameLayout)) {
                return;
            }
            am.post(new Runnable() { // from class: tb.and.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FrameLayout frameLayout = (FrameLayout) am;
                    if (and.a(and.this) == null) {
                        and.a(and.this, new TextView(frameLayout.getContext()));
                        and.a(and.this).setClickable(false);
                        and.a(and.this).setFocusable(false);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 21;
                        and.a(and.this).setLayoutParams(layoutParams);
                        frameLayout.addView(and.a(and.this));
                    }
                    and.a(and.this).setText(and.b(and.this));
                    and.a(and.this).setTextSize(10.0f);
                    if (frameLayout.getChildAt(frameLayout.getChildCount() - 1) == and.a(and.this)) {
                        return;
                    }
                    ViewParent parent = and.a(and.this).getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(and.a(and.this));
                    }
                    frameLayout.addView(and.a(and.this));
                }
            });
        }
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String str = "";
        if (WXSDKManager.getInstance().getAllInstanceMap().get(this.f25450a) == null) {
            return str;
        }
        a a2 = a("downLoad", "wxStartDownLoadBundle", "wxEndDownLoadBundle");
        a a3 = a(pqe.STAGE_INTERACTIVE, "wxRenderTimeOrigin", "wxInteraction");
        a a4 = a("wxEndExecuteBundle", "wxEndLoadBundle", "wxEndExecuteBundle");
        StringBuilder sb = new StringBuilder();
        sb.append("dowlnLoad:");
        sb.append(a2 == null ? str : Long.valueOf(a2.b));
        sb.append("\n evalJsBundle:");
        sb.append(a4 == null ? str : Long.valueOf(a4.b));
        sb.append("\n interaction:");
        Object obj = str;
        if (a3 != null) {
            obj = Long.valueOf(a3.b);
        }
        sb.append(obj);
        return sb.toString();
    }

    /* loaded from: classes2.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f25452a;
        public long b;
        public long c;
        public long d;

        static {
            kge.a(-695808996);
        }

        private a() {
        }

        public static /* synthetic */ JSONObject a(a aVar) throws JSONException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("95992c72", new Object[]{aVar}) : aVar.a();
        }

        private JSONObject a() throws JSONException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("69129956", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stageName", this.f25452a);
            jSONObject.put("beginTime", this.c);
            jSONObject.put("endTime", this.d);
            jSONObject.put("cost", this.b);
            return jSONObject;
        }
    }

    private a a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("fd0243ec", new Object[]{this, str, str2, str3});
        }
        WXSDKInstance wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(this.f25450a);
        if (wXSDKInstance == null) {
            return null;
        }
        a aVar = new a();
        aVar.f25452a = str;
        Long l = wXSDKInstance.ar().f23517a.get(str3);
        Long l2 = wXSDKInstance.ar().f23517a.get(str2);
        long j = -1;
        aVar.c = l2 == null ? -1L : l2.longValue();
        if (l != null) {
            j = l.longValue();
        }
        aVar.d = j;
        aVar.b = aVar.d - aVar.c;
        return aVar;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            BufferedWriter bufferedWriter = null;
            File externalStorageDirectory = Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null;
            if (externalStorageDirectory != null) {
                File absoluteFile = externalStorageDirectory.getAbsoluteFile();
                externalStorageDirectory = new File(absoluteFile, WXEnvironment.getApplication().getPackageName() + "/APM_ONLINE");
            }
            if (externalStorageDirectory == null || !externalStorageDirectory.exists()) {
                externalStorageDirectory.createNewFile();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "Weex");
            jSONObject.put("url", this.h);
            jSONObject.put("pageName", this.h);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(NWFullTracePlugin.FullTraceJSParam.STAGES, jSONArray);
            a a2 = a("downLoad", "wxStartDownLoadBundle", "wxEndDownLoadBundle");
            if (a2 != null) {
                jSONArray.put(a.a(a2));
            }
            a a3 = a("prePareBundle", "wxStartLoadBundle", "wxEndLoadBundle");
            if (a3 != null) {
                jSONArray.put(a.a(a3));
            }
            a a4 = a("evalJsBundle", "wxEndLoadBundle", "wxEndExecuteBundle");
            if (a4 != null) {
                jSONArray.put(a.a(a4));
            }
            a a5 = a(pqe.STAGE_INTERACTIVE, "wxEndExecuteBundle", "wxInteraction");
            if (a5 != null && a5.b > 0) {
                jSONArray.put(a.a(a5));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("extra", jSONObject2);
            a a6 = a("mtopRequest", KEY_STAGE_JS_ASYNC_DATA_START, KEY_STAGE_JS_ASYNC_DATA_END);
            if (a6 != null) {
                jSONObject2.put("mtopRequest", a.a(a6));
            }
            try {
                jSONObject2.put(f.KEY_PAGE_STATS_LAYOUT_TIME, this.g.get(f.KEY_PAGE_STATS_LAYOUT_TIME));
                jSONObject2.put(f.KEY_PAGE_STATS_VIEW_CREATE_COST, this.g.get(f.KEY_PAGE_STATS_VIEW_CREATE_COST));
                jSONObject2.put(f.KEY_PAGE_STATS_COMPONENT_CREATE_COST, this.g.get(f.KEY_PAGE_STATS_COMPONENT_CREATE_COST));
                jSONObject2.put(f.KEY_PAGE_STATS_EXECUTE_JS_CALLBACK_COST, this.g.get(f.KEY_PAGE_STATS_EXECUTE_JS_CALLBACK_COST));
                try {
                    try {
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(externalStorageDirectory, true)));
                        try {
                            bufferedWriter2.write(jSONObject.toString());
                            bufferedWriter2.write(10);
                            bufferedWriter2.close();
                        } catch (Exception e2) {
                            e = e2;
                            bufferedWriter = bufferedWriter2;
                            e.printStackTrace();
                            if (bufferedWriter == null) {
                                return;
                            }
                            bufferedWriter.close();
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
