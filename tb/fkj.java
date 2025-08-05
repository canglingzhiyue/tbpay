package tb;

import android.graphics.Bitmap;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.LimitLinkedHashMap;
import com.etao.feimagesearch.util.ac;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class fkj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IRP_FACE_DETECT_RESULT_FLAG = 16;
    private static volatile fkj c;

    /* renamed from: a  reason: collision with root package name */
    private final LimitLinkedHashMap<Integer, cpa> f28010a = new LimitLinkedHashMap<>(16);
    private final HashMap<Integer, a> b = new HashMap<>();

    /* loaded from: classes3.dex */
    public interface a {
    }

    public static /* synthetic */ HashMap a(fkj fkjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("744d5f16", new Object[]{fkjVar}) : fkjVar.b;
    }

    public static /* synthetic */ LimitLinkedHashMap b(fkj fkjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LimitLinkedHashMap) ipChange.ipc$dispatch("97a13235", new Object[]{fkjVar}) : fkjVar.f28010a;
    }

    static {
        kge.a(829756589);
        c = null;
    }

    public static fkj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fkj) ipChange.ipc$dispatch("f04a179", new Object[0]);
        }
        if (c == null) {
            synchronized (fkj.class) {
                if (c == null) {
                    c = new fkj();
                }
            }
        }
        return c;
    }

    private fkj() {
    }

    public boolean a(final Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc0f2ca", new Object[]{this, bitmap})).booleanValue();
        }
        final int hashCode = bitmap.hashCode();
        final coo a2 = cok.a();
        if (a2 == null) {
            return false;
        }
        VExecutors.defaultSharedThreadPool().submit(new ac() { // from class: tb.fkj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                cpa a3 = a2.a(bitmap);
                cot.c("FaceDetectResultManager", "token=" + hashCode + ", detectResult=" + JSON.toJSONString(a3));
                if (((a) fkj.a(fkj.this).remove(Integer.valueOf(hashCode))) != null) {
                    return;
                }
                fkj.b(fkj.this).put(Integer.valueOf(hashCode), a3);
            }
        });
        return true;
    }

    public Map<String, String> a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("22af5104", new Object[]{this, num});
        }
        HashMap hashMap = new HashMap();
        if (num == null) {
            hashMap.put("faceCount", String.valueOf(-1));
            hashMap.put("face", "-1");
            hashMap.put(coo.KEY_CRO_SAMPLE_ID, UUID.randomUUID().toString());
            return hashMap;
        }
        cpa cpaVar = this.f28010a.get(num);
        if (cpaVar != null) {
            hashMap.put("faceCount", String.valueOf(cpaVar.a()));
            hashMap.put("face", String.valueOf(cpaVar.c()));
            hashMap.put(coo.KEY_CRO_SAMPLE_ID, cpaVar.b());
        } else {
            hashMap.put("faceCount", String.valueOf(-1));
            hashMap.put("face", "-1");
            hashMap.put(coo.KEY_CRO_SAMPLE_ID, UUID.randomUUID().toString());
        }
        return hashMap;
    }

    public static boolean b(Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68e053f2", new Object[]{num})).booleanValue() : num != null && (num.intValue() & 16) > 0;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f28010a.clear();
        this.b.clear();
    }
}
