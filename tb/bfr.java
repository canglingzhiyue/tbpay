package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class bfr implements bfs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f25860a;
    private Map<String, Set<Integer>> b = new HashMap();
    private final List<AttachedResponse> c = new ArrayList();
    private boolean d;

    @Override // tb.bfs
    public void a(AttachedResponse attachedResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392fec34", new Object[]{this, attachedResponse});
        } else if (attachedResponse == null) {
        } else {
            b(attachedResponse);
            if (!attachedResponse.isSucceed().booleanValue()) {
                return;
            }
            int size = this.c.size() - 1;
            while (true) {
                if (size < 0) {
                    size = 0;
                    break;
                } else if (this.c.get(size).getSeqNum().intValue() <= attachedResponse.getSeqNum().intValue()) {
                    break;
                } else {
                    size--;
                }
            }
            this.c.add(size, attachedResponse);
            UnifyLog.a("NextRpc_AttachedQueue", "queue attachedStat=" + this.f25860a + ",isAllAttachedResponse=" + this.d + ",seqNum=" + attachedResponse.getSeqNum() + ",bizName=" + attachedResponse.getBizName(), new Object[0]);
        }
    }

    @Override // tb.bfs
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.clear();
        }
    }

    @Override // tb.bfs
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // tb.bfs
    public List<AttachedResponse> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.c;
    }

    @Override // tb.bfs
    public void a(RemoteMainResponse remoteMainResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17733f99", new Object[]{this, remoteMainResponse});
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(remoteMainResponse.getAttachedResponseStat());
        if (parseObject == null) {
            return;
        }
        Map<String, Object> innerMap = parseObject.getInnerMap();
        if (innerMap != null) {
            this.f25860a = innerMap;
        }
        for (AttachedResponse attachedResponse : this.c) {
            b(attachedResponse);
        }
        UnifyLog.a("NextRpc_AttachedQueue", "onMainResponse attachedStat=" + this.f25860a + ",isAllAttachedResponse=" + this.d + ",attachResponses=" + this.c, new Object[0]);
    }

    private void b(AttachedResponse attachedResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e5b8f5", new Object[]{this, attachedResponse});
        } else if (attachedResponse == null || this.f25860a == null) {
        } else {
            String bizName = attachedResponse.getBizName();
            Integer seqNum = attachedResponse.getSeqNum();
            try {
                try {
                    String obj = this.f25860a.get(bizName) == null ? "" : this.f25860a.get(bizName).toString();
                    if (StringUtils.isEmpty(obj)) {
                        if (!this.f25860a.isEmpty()) {
                            return;
                        }
                        this.d = true;
                        return;
                    }
                    int parseInt = Integer.parseInt(obj);
                    Set<Integer> set = this.b.get(bizName);
                    if (set == null) {
                        set = new HashSet<>();
                        this.b.put(bizName, set);
                    }
                    set.add(seqNum);
                    if (set.size() >= parseInt) {
                        this.f25860a.remove(bizName);
                    }
                    if (!this.f25860a.isEmpty()) {
                        return;
                    }
                    this.d = true;
                } catch (Exception e) {
                    UnifyLog.d("NextRpc_AttachedQueue", "recordAttachAndChangeStat exception:" + e.getMessage(), new Object[0]);
                    if (!this.f25860a.isEmpty()) {
                        return;
                    }
                    this.d = true;
                }
            } catch (Throwable th) {
                if (this.f25860a.isEmpty()) {
                    this.d = true;
                }
                throw th;
            }
        }
    }
}
