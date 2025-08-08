package com.taobao.android.litecreator.base.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.workflow.a;
import com.taobao.android.litecreator.comprehension.ContentComprehensionResult;
import com.taobao.android.litecreator.comprehension.b;
import com.taobao.android.litecreator.comprehension.d;
import com.taobao.android.litecreator.sdk.framework.container.ut.c;
import com.taobao.android.litecreator.util.ab;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.u;
import com.taobao.umipublish.extension.windvane.call.WindvaneCall;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import tb.kge;

/* loaded from: classes5.dex */
public class LCComprehensionRecommendPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASS_NAME = "GGComprehensionTool";
    public static String MATERIAL_LE_VERSION = null;
    public static final String METHOD_NAME_QUERY_COPYRIGHT_INFO = "queryContentAudioCopyrightInfo";
    public static final String METHOD_NAME_QUERY_RESULT = "queryResult";
    public static final String METHOD_OFFER_CONTENT = "offerContent";
    public static final String METHOD_OFFER_INFOS = "offerPublishInfos";
    public static final String METHOD_OFFER_ITEMS = "offerItems";
    public static final String TAG = "LCComprehensionRecommendPlugin";
    private static boolean mIsQuerying;
    private static ArrayList<Runnable> mPendingQueryTasks;

    public static /* synthetic */ Object ipc$super(LCComprehensionRecommendPlugin lCComprehensionRecommendPlugin, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(LCComprehensionRecommendPlugin lCComprehensionRecommendPlugin, ContentComprehensionResult contentComprehensionResult, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db516c6a", new Object[]{lCComprehensionRecommendPlugin, contentComprehensionResult, wVCallBackContext});
        } else {
            lCComprehensionRecommendPlugin.callbackWindVane(contentComprehensionResult, wVCallBackContext);
        }
    }

    public static /* synthetic */ boolean access$102(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        mIsQuerying = z;
        return z;
    }

    public static /* synthetic */ void access$200(LCComprehensionRecommendPlugin lCComprehensionRecommendPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5626ab7b", new Object[]{lCComprehensionRecommendPlugin});
        } else {
            lCComprehensionRecommendPlugin.scheduleNextQueryTask();
        }
    }

    public static /* synthetic */ void access$300(LCComprehensionRecommendPlugin lCComprehensionRecommendPlugin, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71c0e61", new Object[]{lCComprehensionRecommendPlugin, str, wVCallBackContext});
        } else {
            lCComprehensionRecommendPlugin.queryResultSafe(str, wVCallBackContext);
        }
    }

    static {
        kge.a(-1350794675);
        MATERIAL_LE_VERSION = "";
        mIsQuerying = false;
        mPendingQueryTasks = new ArrayList<>();
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("className", CLASS_NAME);
        hashMap.put("funcName", str);
        new c("Page_GGTabs", "gg111.19920601").c(WindvaneCall.TAG, hashMap, true);
        if (METHOD_NAME_QUERY_RESULT.equals(str)) {
            queryResultOneByOne(str2, wVCallBackContext);
            return true;
        } else if (METHOD_OFFER_CONTENT.equals(str)) {
            offerContent(str2, wVCallBackContext);
            return true;
        } else if (METHOD_OFFER_ITEMS.equals(str)) {
            offerItems(str2, wVCallBackContext);
            return true;
        } else if (METHOD_OFFER_INFOS.equals(str)) {
            offerPublishInfos(str2, wVCallBackContext);
            return true;
        } else if (!METHOD_NAME_QUERY_COPYRIGHT_INFO.equals(str)) {
            return false;
        } else {
            queryContentAudioCopyrightInfo(str2, wVCallBackContext);
            return true;
        }
    }

    private void offerContent(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c84b1d8b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        b findComprehensionTool = findComprehensionTool();
        if (findComprehensionTool == null || StringUtils.isEmpty(str)) {
            wVCallBackContext.error();
        } else {
            findComprehensionTool.c(JSONObject.parseObject(str).getString("content"));
        }
    }

    private void offerPublishInfos(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbd3f00", new Object[]{this, str, wVCallBackContext});
            return;
        }
        b findComprehensionTool = findComprehensionTool();
        if (findComprehensionTool == null || StringUtils.isEmpty(str)) {
            wVCallBackContext.error();
        } else {
            findComprehensionTool.a(JSONObject.parseObject(str));
        }
    }

    private void offerItems(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399a5d12", new Object[]{this, str, wVCallBackContext});
            return;
        }
        b findComprehensionTool = findComprehensionTool();
        if (findComprehensionTool == null || StringUtils.isEmpty(str)) {
            wVCallBackContext.error();
            return;
        }
        JSONArray jSONArray = JSONObject.parseObject(str).getJSONArray("itemIds");
        final ArrayList arrayList = new ArrayList();
        ab.a(jSONArray, new ab.a<Object>() { // from class: com.taobao.android.litecreator.base.windvane.LCComprehensionRecommendPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.util.ab.a
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else if (!(obj instanceof String)) {
                } else {
                    arrayList.add((String) obj);
                }
            }
        });
        findComprehensionTool.c(arrayList);
    }

    private void queryContentAudioCopyrightInfo(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d411b49e", new Object[]{this, str, wVCallBackContext});
            return;
        }
        b findComprehensionTool = findComprehensionTool();
        if (findComprehensionTool == null || StringUtils.isEmpty(str)) {
            wVCallBackContext.error();
            return;
        }
        ContentComprehensionResult i = findComprehensionTool.i("recognizeVideoMusic");
        r rVar = new r("HY_SUCCESS");
        org.json.JSONObject jSONObject = i.bizData;
        try {
            if (jSONObject == null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("isValid", false);
                    jSONObject = jSONObject2;
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    e.printStackTrace();
                    rVar.a(jSONObject);
                    wVCallBackContext.success(rVar);
                }
            } else {
                jSONObject.put("isValid", true);
            }
        } catch (JSONException e2) {
            e = e2;
        }
        rVar.a(jSONObject);
        wVCallBackContext.success(rVar);
    }

    private void queryResultOneByOne(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c02f7bc", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Runnable buildQueryTask = buildQueryTask(str, wVCallBackContext);
        if (mIsQuerying) {
            mPendingQueryTasks.add(buildQueryTask);
            u.b(TAG, "query task was running, then waiting.");
            return;
        }
        au.a(buildQueryTask);
    }

    private void scheduleNextQueryTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3463a6a", new Object[]{this});
        } else if (mPendingQueryTasks.size() <= 0) {
        } else {
            u.b(TAG, "execute next query task.");
            Runnable runnable = mPendingQueryTasks.get(0);
            au.c(runnable);
            mPendingQueryTasks.remove(runnable);
        }
    }

    private void queryResultSafe(String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4cc500", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            u.b(TAG, "query result start.");
            mIsQuerying = true;
            queryResult(str, new d<ContentComprehensionResult>() { // from class: com.taobao.android.litecreator.base.windvane.LCComprehensionRecommendPlugin.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.litecreator.comprehension.d
                public void a(ContentComprehensionResult contentComprehensionResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("27851c62", new Object[]{this, contentComprehensionResult});
                        return;
                    }
                    u.b(LCComprehensionRecommendPlugin.TAG, "query result finished. data = " + contentComprehensionResult);
                    LCComprehensionRecommendPlugin.access$000(LCComprehensionRecommendPlugin.this, contentComprehensionResult, wVCallBackContext);
                    LCComprehensionRecommendPlugin.access$102(false);
                    LCComprehensionRecommendPlugin.access$200(LCComprehensionRecommendPlugin.this);
                }
            });
        } catch (Throwable unused) {
            u.d(TAG, "query result exception.");
            callbackWindVane(null, wVCallBackContext);
            mIsQuerying = false;
            scheduleNextQueryTask();
        }
    }

    private void callbackWindVane(ContentComprehensionResult contentComprehensionResult, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23618391", new Object[]{this, contentComprehensionResult, wVCallBackContext});
        } else if (contentComprehensionResult == null) {
            wVCallBackContext.error(new r("HY_FAILED"));
        } else {
            r rVar = new r("HY_SUCCESS");
            rVar.a(contentComprehensionResult.bizData);
            wVCallBackContext.success(rVar);
        }
    }

    private String findComprehensionLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c18a5930", new Object[]{this});
        }
        if (!(this.mContext instanceof a)) {
            u.d(TAG, "the host is not a ugc node.");
            return "";
        }
        IUGCMedia d = com.taobao.android.litecreator.base.workflow.e.d(this.mContext);
        if (d != null) {
            return (String) d.getMeta("ugc_labels");
        }
        u.d(TAG, "can not find label!");
        return "";
    }

    private void queryResult(String str, d<ContentComprehensionResult> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d53cd0", new Object[]{this, str, dVar});
            return;
        }
        b findComprehensionTool = findComprehensionTool();
        JSONObject parseObject = JSONObject.parseObject(str);
        JSONArray jSONArray = parseObject.getJSONArray("recommendKeys");
        long j = getLong(parseObject.getString("timeout"), 5000L);
        JSONObject jSONObject = new JSONObject();
        JSONArray parseArray = JSONObject.parseArray(findComprehensionLabel());
        jSONObject.put("materialVersion", (Object) MATERIAL_LE_VERSION);
        jSONObject.put("labels", (Object) parseArray);
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add("topic");
        if (jSONArray == null) {
            jSONArray = jSONArray2;
        }
        String string = jSONArray.getString(0);
        if (StringUtils.isEmpty(string)) {
            string = "topic";
        }
        if (j <= 0) {
            dVar.a(findComprehensionTool.i(string));
            return;
        }
        findComprehensionTool.a(string, jSONArray, jSONObject);
        findComprehensionTool.a(string, dVar);
    }

    private Runnable buildQueryTask(final String str, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("ce500847", new Object[]{this, str, wVCallBackContext}) : new Runnable() { // from class: com.taobao.android.litecreator.base.windvane.LCComprehensionRecommendPlugin.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LCComprehensionRecommendPlugin.access$300(LCComprehensionRecommendPlugin.this, str, wVCallBackContext);
                }
            }
        };
    }

    private b findComprehensionTool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("48376b88", new Object[]{this});
        }
        if (!(this.mContext instanceof a)) {
            u.d(TAG, "the host is not a ugc node.");
            return null;
        }
        IUGCMedia d = com.taobao.android.litecreator.base.workflow.e.d(this.mContext);
        if (d != null) {
            return b.a(d.getPublishSessionId());
        }
        u.d(TAG, "can not find data!");
        return null;
    }

    private long getLong(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7efaf15", new Object[]{this, str, new Long(j)})).longValue();
        }
        try {
            return StringUtils.isEmpty(str) ? j : Long.parseLong(str);
        } catch (Throwable unused) {
            return j;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
