package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.CacheCleaner;
import com.taobao.android.cachecleaner.autoclear.biz.ConfigCenter;
import com.taobao.android.cachecleaner.autoclear.biz.c;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizActionData;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizVerConditionData;
import com.taobao.android.cachecleaner.autoclear.biz.data.PageList;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class duz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String f;

    /* renamed from: a  reason: collision with root package name */
    public final String f27006a;
    public final Context b;
    public final BizTaskData c;
    public final String d;
    public final Map<String, Long> e;

    /* loaded from: classes4.dex */
    public interface a {
        long a(BizActionData bizActionData);
    }

    public abstract long a(BizActionData bizActionData, Map<String, Long> map);

    static {
        kge.a(-2066976053);
        f = duz.class.getSimpleName();
    }

    public duz(Context context, BizTaskData bizTaskData) {
        this.b = context;
        this.c = bizTaskData;
        this.f27006a = bizTaskData.taskId;
        this.d = bizTaskData.triggerTime;
        this.e = bizTaskData.pathMap;
    }

    public b a(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b62d52a2", new Object[]{this, map});
        }
        if (!a(this.b, this.c.condition)) {
            return new b(false, -1L, b.MSG_VERSION_CONDITION_MATCH_FAILED);
        }
        if (!com.taobao.android.cachecleaner.autoclear.biz.b.a(this.c.sizeCondition, map)) {
            return new b(false, -1L, b.MSG_CONDITION_MATCH_FAILED);
        }
        b bVar = new b();
        long j = 0;
        for (BizActionData bizActionData : this.c.actionList) {
            long a2 = a(bizActionData, map);
            if (a2 < 0) {
                b.a(bVar, false);
                b.a(bVar, b.MSG_BIZ_ACTION_FAILED + this.f27006a);
            } else {
                j += a2;
            }
        }
        b.a(bVar, j);
        if (b.a(bVar)) {
            b(this.c.condition);
        }
        return bVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f27006a;
    }

    public Map<String, Long> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.e;
    }

    private boolean a(Context context, BizVerConditionData bizVerConditionData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2743a8e", new Object[]{this, context, bizVerConditionData})).booleanValue();
        }
        if (bizVerConditionData == null) {
            return false;
        }
        return (!bizVerConditionData.abEnable || ConfigCenter.isBizClearEnable(context, bizVerConditionData.abKey)) && !a(bizVerConditionData) && c.a(bizVerConditionData.appVersion, com.taobao.android.cachecleaner.monitor.config.a.a().e()) && c.a(bizVerConditionData.osVersion, Build.VERSION.RELEASE) && c(bizVerConditionData);
    }

    private boolean a(BizVerConditionData bizVerConditionData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a5a7a96", new Object[]{this, bizVerConditionData})).booleanValue();
        }
        if (bizVerConditionData != null && !StringUtils.isEmpty(bizVerConditionData.checkKey)) {
            return this.b.getSharedPreferences("biz_clear_executed_sp", 0).getBoolean(bizVerConditionData.checkKey, false);
        }
        return false;
    }

    private void b(BizVerConditionData bizVerConditionData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b28f913", new Object[]{this, bizVerConditionData});
        } else if (bizVerConditionData == null || StringUtils.isEmpty(bizVerConditionData.checkKey)) {
        } else {
            SharedPreferences.Editor edit = this.b.getSharedPreferences("biz_clear_executed_sp", 0).edit();
            edit.putBoolean(bizVerConditionData.checkKey, true);
            edit.commit();
        }
    }

    private boolean c(BizVerConditionData bizVerConditionData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bf77798", new Object[]{this, bizVerConditionData})).booleanValue();
        }
        try {
        } catch (Exception e) {
            String str = f;
            TLog.loge(CacheCleaner.MODULE, str, "checkPageList error :" + e.getMessage());
        }
        if (com.taobao.application.common.c.b() == null) {
            TLog.loge(CacheCleaner.MODULE, f, "apm getTopActivity is null");
            return true;
        }
        String str2 = null;
        String name = com.taobao.application.common.c.b().getClass().getName();
        if (com.taobao.application.common.c.b().getIntent() != null) {
            str2 = com.taobao.application.common.c.b().getIntent().getDataString();
        }
        if (!a(bizVerConditionData.enablePageList, name, str2) || !b(bizVerConditionData.disablePageList, name, str2)) {
            return false;
        }
        String str3 = f;
        TLog.logd(CacheCleaner.MODULE, str3, "checkPageList result = true");
        return true;
    }

    private boolean a(List<PageList> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f2065f1", new Object[]{this, list, str, str2})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return true;
        }
        for (PageList pageList : list) {
            if (pageList != null && pageList.isMarch(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(List<PageList> list, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94b46ef2", new Object[]{this, list, str, str2})).booleanValue();
        }
        if (list != null && !list.isEmpty()) {
            for (PageList pageList : list) {
                if (pageList != null && pageList.isMarch(str, str2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final boolean CLEAR_FAILED = false;
        public static final boolean CLEAR_SUCCESS = true;
        public static final int DEFAULT_CLEAR_SIZE = -1;
        public static final String MSG_BIZ_ACTION_FAILED = "CLEAR_ACTION_FAILED_WITH_TASK_";
        public static final String MSG_CONDITION_MATCH_FAILED = "MATCH_CONDITION_FAILED";
        public static final String MSG_DEFAULT = "";
        public static final String MSG_VERSION_CONDITION_MATCH_FAILED = "MATCH_VERSION_CONDITION_FAILED";

        /* renamed from: a  reason: collision with root package name */
        private boolean f27007a;
        private long b;
        private String c;

        static {
            kge.a(-67303216);
        }

        public static /* synthetic */ long a(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea1337e7", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.b = j;
            return j;
        }

        public static /* synthetic */ String a(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b1560d85", new Object[]{bVar, str});
            }
            bVar.c = str;
            return str;
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f708dcf5", new Object[]{bVar})).booleanValue() : bVar.f27007a;
        }

        public static /* synthetic */ boolean a(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ea137407", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.f27007a = z;
            return z;
        }

        public b() {
            this("");
        }

        public b(String str) {
            this(true, -1L, str);
        }

        public b(boolean z, long j, String str) {
            this.f27007a = z;
            this.b = j;
            this.c = str;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f27007a;
        }

        public long b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }
    }
}
