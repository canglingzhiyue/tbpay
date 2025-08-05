package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.runtimepermission.api.TBRunTimePermission;
import com.taobao.taolive.sdk.model.message.ExplainBehaviorReportMessage;
import com.taobao.taolive.sdk.utils.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes6.dex */
public class jzn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f29889a = true;
        public long b;
        public ExplainBehaviorReportMessage.Segment c;

        static {
            kge.a(-667790357);
        }

        public a(long j) {
            this.b = j;
        }
    }

    static {
        kge.a(-1504330190);
        TAG = jzn.class.getSimpleName();
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ebd1bd", new Object[]{aVar, str, new Long(j)});
        } else if (!hkk.al() || aVar == null) {
        } else {
            String a2 = pmd.a().q().a();
            long b = b(aVar);
            long currentTimeMillis = System.currentTimeMillis();
            tfu tfuVar = new tfu(a2, str, b, currentTimeMillis, j);
            tfu tfuVar2 = new tfu(a2, str, b, currentTimeMillis, j);
            a(aVar.I, tfuVar);
            a(aVar.H, tfuVar2);
        }
    }

    public static long b(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c31b70", new Object[]{aVar})).longValue();
        }
        if (aVar == null) {
            return 0L;
        }
        long C = aVar.i() != null ? aVar.i().C() : 0L;
        return (!hkk.av() || C <= 0) ? aVar.z() != null ? aVar.z().L() : 0L : C;
    }

    private static void a(Queue<tfu> queue, tfu tfuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d760d555", new Object[]{queue, tfuVar});
        } else if (queue == null || tfuVar == null) {
        } else {
            while (queue.size() >= hkk.am()) {
                queue.poll();
            }
            queue.offer(tfuVar);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            if (aVar.I != null) {
                aVar.I.clear();
            }
            if (aVar.H == null) {
                return;
            }
            aVar.H.clear();
        }
    }

    public static void a(List<ExplainBehaviorReportMessage.Segment> list, Queue<tfu> queue, String str) {
        Map hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4cb41", new Object[]{list, queue, str});
        } else if (list != null && !list.isEmpty() && queue != null && !queue.isEmpty() && com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
            HashMap<String, String> hashMap2 = new HashMap<>();
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                ExplainBehaviorReportMessage.Segment segment = list.get(i);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("explainTopicId", String.valueOf(segment.explainTopicId));
                hashMap3.put("explainItemId", String.valueOf(segment.explainItemId));
                hashMap3.put("explainStartTime", segment.explainStartTime);
                hashMap3.put("explainEndTime", segment.explainEndTime);
                boolean z2 = false;
                while (queue.peek() != null) {
                    tfu peek = queue.peek();
                    if (peek.c < l.b(segment.explainStartTime)) {
                        queue.poll();
                    } else if (peek.c <= l.b(segment.explainStartTime) || peek.c > l.b(segment.explainEndTime)) {
                        break;
                    } else {
                        if (hashMap3.containsKey(peek.b)) {
                            hashMap = (Map) hashMap3.get(peek.b);
                            int intValue = ((Integer) hashMap.get("count")).intValue();
                            int intValue2 = ((Integer) hashMap.get("explainCurrentGoodsCount")).intValue();
                            hashMap.put("count", Integer.valueOf(intValue + 1));
                            if (segment.explainItemId == peek.e) {
                                intValue2++;
                            }
                            hashMap.put("explainCurrentGoodsCount", Integer.valueOf(intValue2));
                        } else {
                            hashMap = new HashMap();
                            hashMap.put("count", 1);
                            hashMap.put("explainCurrentGoodsCount", Integer.valueOf(segment.explainItemId == peek.e ? 1 : 0));
                        }
                        hashMap3.put(peek.b, hashMap);
                        queue.poll();
                        z = true;
                        z2 = true;
                    }
                }
                if (z2) {
                    hashMap2.put(TBRunTimePermission.EXPLAIN_PARAM_NAME + String.valueOf(i + 1), pqj.a(hashMap3));
                }
            }
            hashMap2.put("explainType", str);
            if (!z) {
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("explainGoodsBehavior", hashMap2);
        }
    }

    public static void a(ExplainBehaviorReportMessage.Segment segment, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c1ffc57", new Object[]{segment, str, str2, new Boolean(z)});
        } else if (segment == null || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("explainType", str);
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, String.valueOf(segment.liveId));
            hashMap.put("itemId", String.valueOf(segment.explainItemId));
            hashMap.put("explainTopicId", segment.explainTopicId);
            hashMap.put("explainStartTime", segment.explainStartTime);
            if (TextUtils.equals(str2, "endExplainGoods")) {
                hashMap.put("explainEndTime", segment.explainEndTime);
                hashMap.put("watchExplainTime", String.valueOf(l.b(segment.explainEndTime) - l.b(segment.explainStartTime)));
                hashMap.put("isLeaveRoom", z ? "1" : "0");
            }
            hashMap.put("systemTime", String.valueOf(System.currentTimeMillis()));
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a(str2, hashMap);
        }
    }

    public static void a(ExplainBehaviorReportMessage explainBehaviorReportMessage, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357ad48d", new Object[]{explainBehaviorReportMessage, aVar});
        } else if (aVar == null) {
        } else {
            if (aVar.f29889a) {
                if (l.b(explainBehaviorReportMessage.segmentList.get(0).explainStartTime) < aVar.b) {
                    explainBehaviorReportMessage.segmentList.get(0).explainStartTime = String.valueOf(aVar.b);
                }
                a(explainBehaviorReportMessage.segmentList.get(0), explainBehaviorReportMessage.explainType, "startExplainGoods", false);
                aVar.f29889a = false;
            }
            aVar.c = explainBehaviorReportMessage.segmentList.get(explainBehaviorReportMessage.segmentList.size() - 1);
        }
    }

    public static void a(a aVar, Queue<tfu> queue, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af60ee7", new Object[]{aVar, queue, str, new Long(j)});
        } else if (aVar == null || aVar.c == null) {
        } else {
            if (l.b(aVar.c.explainEndTime) < j) {
                aVar.c.explainEndTime = String.valueOf(j);
            }
            a(Collections.singletonList(aVar.c), queue, str);
            a(aVar.c, str, "endExplainGoods", true);
        }
    }
}
