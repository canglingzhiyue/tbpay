package com.taobao.themis.open.packages.downloader;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.open.packages.downloader.a;
import com.taobao.zcache.PackRequest;
import com.taobao.zcache.n;
import kotlin.Metadata;
import kotlin.Pair;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u001c\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\"\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\u000e"}, d2 = {"downloadPackageUseZCacheWithPackRequest", "", "packRequest", "Lcom/taobao/zcache/PackRequest;", "downloadCallback", "Lcom/taobao/themis/open/packages/downloader/IPackageDownloader$PackageDownloadCallback;", "downloadPackageWithCacheInfo", "cacheInfo", "Lcom/alibaba/fastjson/JSONObject;", "downloadPackageWithUrlByZCache", "url", "", "getZCachePackDataByCacheInfo", "Lkotlin/Pair;", "themis_open_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(385198299);
    }

    private static final Pair<String, JSONObject> a(JSONObject jSONObject) {
        String next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("24e51071", new Object[]{jSONObject});
        }
        if (jSONObject != null && jSONObject.keySet().size() != 0 && (next = jSONObject.keySet().iterator().next()) != null) {
            return new Pair<>(next, jSONObject.getJSONObject(next));
        }
        return null;
    }

    public static final void a(JSONObject jSONObject, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0152f7f", new Object[]{jSONObject, bVar});
        } else if (jSONObject == null) {
            if (bVar == null) {
                return;
            }
            bVar.a(new a.C0963a(0, "cacheInfo is null"));
        } else {
            Pair<String, JSONObject> a2 = a(jSONObject);
            if (a2 != null) {
                String first = a2.getFirst();
                JSONObject second = a2.getSecond();
                a(new PackRequest(first, second != null ? second.toString() : null), bVar);
            } else if (bVar == null) {
            } else {
                bVar.a(new a.C0963a(0, "packData is null ,cache info is " + jSONObject));
            }
        }
    }

    private static final void a(PackRequest packRequest, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee26a0e", new Object[]{packRequest, bVar});
        } else {
            n.a(packRequest, new e(new ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadFinishCallback$1(bVar, packRequest)), new f(new ZCacheExtKt$downloadPackageUseZCacheWithPackRequest$downloadProgressCallback$1(bVar)));
        }
    }

    public static final void a(String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d4c429", new Object[]{str, bVar});
        } else if (str != null) {
            a(new PackRequest(str, null), bVar);
        } else if (bVar == null) {
        } else {
            bVar.a(new a.C0963a(0, "cdn url is null"));
        }
    }
}
