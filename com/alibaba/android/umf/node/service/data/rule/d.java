package com.alibaba.android.umf.node.service.data.rule;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.service.parse.UMFParseIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.bpx;
import tb.bqb;
import tb.bqi;
import tb.bqo;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends bqo<UMFRuleIO, UMFParseIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f2842a;

    static {
        kge.a(-1433875207);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1108555646) {
            super.onAfterExecute((UMFBaseIO) objArr[0], (com.alibaba.android.umf.datamodel.b) objArr[1]);
            return null;
        } else if (hashCode != 2016452897) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onBeforeExecute((UMFBaseIO) objArr[0], (com.alibaba.android.umf.datamodel.b) objArr[1]);
            return null;
        }
    }

    @Override // tb.bqo, com.alibaba.android.umf.node.service.IUMFService
    public /* synthetic */ void onAfterExecute(UMFBaseIO uMFBaseIO, com.alibaba.android.umf.datamodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdecc882", new Object[]{this, uMFBaseIO, bVar});
        } else {
            a((UMFParseIO) uMFBaseIO, bVar);
        }
    }

    @Override // tb.bqo, com.alibaba.android.umf.node.service.IUMFService
    public /* synthetic */ void onBeforeExecute(UMFBaseIO uMFBaseIO, com.alibaba.android.umf.datamodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7830a121", new Object[]{this, uMFBaseIO, bVar});
        } else {
            a((UMFRuleIO) uMFBaseIO, bVar);
        }
    }

    @Override // com.alibaba.android.umf.node.service.IUMFService
    public /* synthetic */ void onExecute(UMFBaseIO uMFBaseIO, com.alibaba.android.umf.datamodel.b bVar, bpx bpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b708d66", new Object[]{this, uMFBaseIO, bVar, bpxVar});
        } else {
            a((UMFRuleIO) uMFBaseIO, bVar, bpxVar);
        }
    }

    public static /* synthetic */ c a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("abb3f20f", new Object[]{dVar}) : dVar.f2842a;
    }

    public d() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f2842a = new c();
        }
    }

    public void a(final UMFRuleIO uMFRuleIO, com.alibaba.android.umf.datamodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c13743", new Object[]{this, uMFRuleIO, bVar});
            return;
        }
        super.onBeforeExecute(uMFRuleIO, bVar);
        a(bqi.class, new bqb<bqi>() { // from class: com.alibaba.android.umf.node.service.data.rule.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bqb
            public /* bridge */ /* synthetic */ void a(bqi bqiVar) {
            }
        });
    }

    public void a(final UMFRuleIO uMFRuleIO, com.alibaba.android.umf.datamodel.b bVar, final bpx<UMFParseIO> bpxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95a77089", new Object[]{this, uMFRuleIO, bVar, bpxVar});
            return;
        }
        List list = (List) a(bqi.class, new bqb<bqi>() { // from class: com.alibaba.android.umf.node.service.data.rule.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bqb
            public void a(bqi bqiVar) {
                UltronDeltaProtocol a2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e238f69e", new Object[]{this, bqiVar});
                } else if (uMFRuleIO.getActions() == null || (a2 = d.a(d.this).a(uMFRuleIO.getActions(), null, bqiVar)) == null) {
                } else {
                    UMFParseIO uMFParseIO = new UMFParseIO();
                    uMFParseIO.dataProtocol = (JSONObject) JSONObject.toJSON(a2);
                    bpxVar.a((bpx) uMFParseIO);
                }
            }
        }).a();
        if (list != null && !list.isEmpty()) {
            return;
        }
        bpxVar.a(new com.alibaba.android.umf.datamodel.a("-1", "没有注册IUMFRuleExtension，请检查配置"));
    }

    public void a(final UMFParseIO uMFParseIO, com.alibaba.android.umf.datamodel.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c614d", new Object[]{this, uMFParseIO, bVar});
            return;
        }
        super.onAfterExecute(uMFParseIO, bVar);
        a(bqi.class, new bqb<bqi>() { // from class: com.alibaba.android.umf.node.service.data.rule.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bqb
            public /* bridge */ /* synthetic */ void a(bqi bqiVar) {
            }
        });
    }

    @Override // tb.bqo, com.alibaba.android.umf.node.service.IUMFService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
