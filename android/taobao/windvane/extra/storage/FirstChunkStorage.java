package android.taobao.windvane.extra.storage;

import android.net.Uri;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.uc.FirstTruckCacheSSRService;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import tb.kge;

/* loaded from: classes2.dex */
public class FirstChunkStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final IStorage STORAGE;
    private final String mStorageKey;

    static {
        kge.a(181203431);
        STORAGE = StorageFactory.createStorageInstance("WindVaneFirstChunkV2");
    }

    public FirstChunkStorage(String str) {
        Uri parse = Uri.parse(str);
        if (j.commonConfig.cJ) {
            String queryParameter = parse.getQueryParameter("fcc_match_query");
            if (!StringUtils.isEmpty(queryParameter)) {
                this.mStorageKey = parse.buildUpon().clearQuery().appendQueryParameter(queryParameter, parse.getQueryParameter(queryParameter)).toString();
                return;
            }
            this.mStorageKey = parse.buildUpon().clearQuery().toString();
            return;
        }
        this.mStorageKey = parse.buildUpon().clearQuery().toString();
    }

    public synchronized boolean write(ResponseContext responseContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdde2bc8", new Object[]{this, responseContext})).booleanValue();
        } else if (responseContext == null) {
            e.a(RVLLevel.Error, FirstTruckCacheSSRService.TAG, "responseContext = null");
            return false;
        } else if (StringUtils.isEmpty(responseContext.getHtml())) {
            e.a(RVLLevel.Error, FirstTruckCacheSSRService.TAG, "responseContext.html is empty");
            return false;
        } else if (responseContext.getHtml().length() != responseContext.getHtmlLength()) {
            e.a(RVLLevel.Error, FirstTruckCacheSSRService.TAG, "responseContext.html length is unexpected.");
            return false;
        } else {
            JSONObject jSONObject = null;
            if (!j.commonConfig.dg) {
                String read = STORAGE.read(this.mStorageKey);
                if (!StringUtils.isEmpty(read)) {
                    try {
                        jSONObject = JSONObject.parseObject(read);
                    } catch (Exception unused) {
                    }
                }
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (responseContext.isEnable()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FirstTruckCacheSSRService.RESPONSE_HEADER_ENABLE_FCC, (Object) Boolean.valueOf(responseContext.isEnable()));
                jSONObject2.put(FirstTruckCacheSSRService.CACHE_HTML, (Object) responseContext.getHtml());
                jSONObject2.put(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_RULE, (Object) responseContext.getRule());
                jSONObject2.put(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_VERSION, (Object) responseContext.getVersion());
                jSONObject2.put(FirstTruckCacheSSRService.CACHE_HTML_LENGTH, (Object) Integer.valueOf(responseContext.getHtmlLength()));
                jSONObject2.put(FirstTruckCacheSSRService.CACHE_URL, (Object) responseContext.getUrl());
                jSONObject2.put(FirstTruckCacheSSRService.RESPONSE_HEADER_FCC_EXPIRED_TIMESTAMP, (Object) Long.valueOf(responseContext.getExpiredTime()));
                jSONObject2.put(FirstTruckCacheSSRService.CACHE_PRIORITY, (Object) Integer.valueOf(responseContext.getPriority()));
                jSONObject.put(responseContext.getRule(), (Object) jSONObject2);
            } else {
                jSONObject.remove(responseContext.getRule());
            }
            return STORAGE.write(this.mStorageKey, jSONObject.toJSONString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: all -> 0x00ff, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0009, B:10:0x001d, B:14:0x0027, B:16:0x0039, B:22:0x0043, B:23:0x004b, B:25:0x0051, B:27:0x0059, B:29:0x0067, B:47:0x00a8, B:49:0x00f2, B:32:0x0070, B:34:0x007c, B:36:0x008a), top: B:60:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized android.taobao.windvane.extra.storage.ResponseContext read(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.storage.FirstChunkStorage.read(java.lang.String):android.taobao.windvane.extra.storage.ResponseContext");
    }

    public synchronized void remove() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41689b0b", new Object[]{this});
        } else {
            STORAGE.remove(this.mStorageKey);
        }
    }

    private boolean isValidResponseContext(ResponseContext responseContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec16aab", new Object[]{this, responseContext})).booleanValue();
        }
        if (responseContext == null || StringUtils.isEmpty(responseContext.getHtml()) || responseContext.getHtml().length() != responseContext.getHtmlLength()) {
            return false;
        }
        return responseContext.isEnable();
    }
}
