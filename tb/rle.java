package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.c;
import com.taobao.mrt.task.desc.MRTPythonLibDescription;
import com.tmall.android.dai.d;
import com.tmall.android.dai.internal.config.a;
import com.tmall.android.dai.internal.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public class rle implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NativeApiBridge";

    /* renamed from: a  reason: collision with root package name */
    private static volatile rle f33219a;
    private final ArrayList<MRTPythonLibDescription> b = new ArrayList<>();

    static {
        kge.a(-792256749);
        kge.a(1914895581);
    }

    public static rle a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rle) ipChange.ipc$dispatch("f0a1913", new Object[0]);
        }
        synchronized (rle.class) {
            if (f33219a == null) {
                f33219a = new rle();
            }
        }
        return f33219a;
    }

    @Override // com.tmall.android.dai.d
    public Map<String, String> onTask(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        LogUtil.d(TAG, "DAI onTask params: " + map);
        HashMap hashMap = new HashMap();
        String str = map.get("__action__");
        if (StringUtils.equals("on_walle_config_update", str)) {
            a.a().b();
        } else if (StringUtils.equals("register_python_lib", str)) {
            String str2 = map.get("name");
            MRTPythonLibDescription mRTPythonLibDescription = new MRTPythonLibDescription(str2, map.get("mmd5"), map.get("furl"), map.get("fmd5"), null);
            if (c.a()) {
                LogUtil.d(TAG, "DAI register lib: " + str2);
                msm.a().a(mRTPythonLibDescription);
            } else {
                LogUtil.d(TAG, "DAI add pending lib: " + str2);
                this.b.add(mRTPythonLibDescription);
            }
            hashMap.put("success", "true");
        }
        return hashMap;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        LogUtil.d(TAG, "DAI onMrtAvalible ");
        Iterator<MRTPythonLibDescription> it = this.b.iterator();
        while (it.hasNext()) {
            MRTPythonLibDescription next = it.next();
            LogUtil.d(TAG, "DAI Register Pending " + next.resourceName);
            msm.a().a(next);
        }
    }
}
