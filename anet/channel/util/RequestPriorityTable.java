package anet.channel.util;

import anet.channel.request.Request;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.comprehension.f;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import com.taobao.android.weex_framework.util.a;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class RequestPriorityTable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, Integer> extPriorityMap;

    static {
        kge.a(-1506856823);
        HashMap hashMap = new HashMap();
        extPriorityMap = hashMap;
        hashMap.put("tpatch", 3);
        extPriorityMap.put("so", 3);
        extPriorityMap.put("json", 3);
        extPriorityMap.put("html", 4);
        extPriorityMap.put("htm", 4);
        extPriorityMap.put("css", 5);
        extPriorityMap.put("js", 5);
        extPriorityMap.put(BlobManager.UPLOAD_IMAGE_TYPE_WEBP, 6);
        extPriorityMap.put("png", 6);
        extPriorityMap.put(f.FILE_TYPE_IMAGE_JPG, 6);
        extPriorityMap.put(a.ATOM_do, 6);
        extPriorityMap.put(WeexZipModule.NAME, Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        extPriorityMap.put("bin", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
        extPriorityMap.put("apk", Integer.valueOf(ThreadPoolExecutorFactory.Priority.LOW));
    }

    public static int lookup(Request request) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4172f533", new Object[]{request})).intValue();
        }
        if (request == null) {
            throw new NullPointerException("url is null!");
        }
        if (request.getHeaders().containsKey("x-pv")) {
            return 1;
        }
        String trySolveFileExtFromUrlPath = HttpHelper.trySolveFileExtFromUrlPath(request.getHttpUrl().path());
        if (trySolveFileExtFromUrlPath != null && (num = extPriorityMap.get(trySolveFileExtFromUrlPath)) != null) {
            return num.intValue();
        }
        return 6;
    }
}
