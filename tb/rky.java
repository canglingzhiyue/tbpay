package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.mrt.service.a;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.mrt.task.g;
import com.taobao.mrt.utils.a;
import com.tmall.android.dai.d;
import com.tmall.android.dai.internal.util.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public class rky implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1257041772);
        kge.a(1914895581);
    }

    @Override // com.tmall.android.dai.d
    public Map<String, String> onTask(Map<String, String> map) {
        String b;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        if (map == null) {
            hashMap.put("success", "0");
            hashMap.put("path", "");
            return hashMap;
        }
        final String str = map.get(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        String str2 = map.get("fileName");
        if (Integer.valueOf(map.get("async")).intValue() == 1) {
            z = true;
        }
        a.b("DownloadResourceTask", noa.KEY_MODEL_NAME + str + ",fileName:" + str2 + ",async:" + z);
        MRTTaskDescription b2 = g.a().b(str);
        if (b2 != null && b2.optResource != null && b2.optResource.files != null && b2.optResource.files.containsKey(str2)) {
            final MRTFilesDescription mRTFilesDescription = b2.optResource;
            if (mRTFilesDescription.resourceOperation == null || !(mRTFilesDescription.resourceOperation instanceof msh)) {
                hashMap.put("success", "0");
                hashMap.put("path", "");
                return hashMap;
            }
            final msh mshVar = (msh) mRTFilesDescription.resourceOperation;
            String b3 = mshVar.b(str2);
            if (!StringUtils.isEmpty(b3)) {
                hashMap.put("success", "1");
                hashMap.put("path", b3);
                return hashMap;
            }
            CountDownLatch countDownLatch = !z ? new CountDownLatch(1) : null;
            final CountDownLatch countDownLatch2 = countDownLatch;
            com.taobao.mrt.task.d.a().a(mRTFilesDescription, new a.InterfaceC0727a() { // from class: tb.rky.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.mrt.service.a.InterfaceC0727a
                public void a(boolean z2, Exception exc, String str3) {
                    boolean z3;
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("daac2de4", new Object[]{this, new Boolean(z2), exc, str3});
                        return;
                    }
                    mshVar.a(str3);
                    try {
                        z3 = mshVar.a();
                    } catch (Exception e) {
                        e.printStackTrace();
                        z3 = false;
                    }
                    CountDownLatch countDownLatch3 = countDownLatch2;
                    if (countDownLatch3 != null) {
                        countDownLatch3.countDown();
                        return;
                    }
                    String str4 = str;
                    MRTFilesDescription mRTFilesDescription2 = mRTFilesDescription;
                    if (exc != null) {
                        i = -1;
                    }
                    h.a(str4, mRTFilesDescription2, i, z3);
                }
            });
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                b = mshVar.b(str2);
            } else {
                b = b3;
            }
            hashMap.put("success", "1");
            hashMap.put("path", b);
            return hashMap;
        }
        hashMap.put("success", "0");
        hashMap.put("path", "");
        return hashMap;
    }
}
