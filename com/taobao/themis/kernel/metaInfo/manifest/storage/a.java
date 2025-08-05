package com.taobao.themis.kernel.metaInfo.manifest.storage;

import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.db.TMSDBAdapter;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final LruCache<String, AppManifestDao> f22554a;

    static {
        kge.a(347151288);
        INSTANCE = new a();
        f22554a = new LruCache<>(10);
    }

    private a() {
    }

    public final AppManifestDao a(String id) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppManifestDao) ipChange.ipc$dispatch("44eb1b0d", new Object[]{this, id});
        }
        q.d(id, "id");
        AppManifestDao appManifestDao = f22554a.get(id);
        if (appManifestDao != null) {
            return (AppManifestDao) JSON.parseObject(JSONObject.toJSONString(appManifestDao), AppManifestDao.class);
        }
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) qpt.b(TMSDBAdapter.class);
        AppManifestDao appManifestDao2 = null;
        if (tMSDBAdapter == null) {
            return null;
        }
        if (!tMSDBAdapter.isReady()) {
            TMSLogger.d("ManifestStorage", "dbAdapter has not Ready");
            return null;
        }
        List<AppManifestDao> selectAppManifest = tMSDBAdapter.selectAppManifest("SELECT * FROM cached_app_manifest2 WHERE appId=" + id);
        if (selectAppManifest != null) {
            appManifestDao2 = (AppManifestDao) p.a((List<? extends Object>) selectAppManifest, 0);
        }
        if (appManifestDao2 != null) {
            f22554a.put(id, appManifestDao2);
        }
        return appManifestDao2;
    }

    public final void a(AppManifestDao manifestDao) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2004a43", new Object[]{this, manifestDao});
            return;
        }
        q.d(manifestDao, "manifestDao");
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) qpt.b(TMSDBAdapter.class);
        if (q.a((Object) (tMSDBAdapter != null ? Boolean.valueOf(tMSDBAdapter.insertAppManifest(manifestDao)) : null), (Object) true)) {
            f22554a.put(manifestDao.getAppId(), manifestDao);
        } else {
            TMSLogger.d("ManifestStorage", "saveManifest failed");
        }
    }

    public final void b(String id) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, id});
            return;
        }
        q.d(id, "id");
        f22554a.remove(id);
        String str = "DELETE FROM cached_app_manifest2 WHERE appId='" + id + '\'';
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) qpt.b(TMSDBAdapter.class);
        if (tMSDBAdapter == null) {
            return;
        }
        tMSDBAdapter.execSQL(str);
    }

    public final List<AppManifestDao> a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c8f176b", new Object[]{this, new Long(j)});
        }
        String str = "SELECT * FROM cached_app_manifest2 WHERE lastUsedTimeStamp>" + j;
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) qpt.b(TMSDBAdapter.class);
        if (tMSDBAdapter == null) {
            return null;
        }
        return tMSDBAdapter.selectAppManifest(str);
    }

    public final void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        f22554a.evictAll();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM cached_app_manifest2 WHERE appId NOT IN (");
        sb.append(list != null ? p.a(list, ",", null, null, 0, null, null, 62, null) : null);
        sb.append(')');
        String sb2 = sb.toString();
        TMSDBAdapter tMSDBAdapter = (TMSDBAdapter) qpt.b(TMSDBAdapter.class);
        if (tMSDBAdapter == null) {
            return;
        }
        tMSDBAdapter.execSQL(sb2);
    }
}
