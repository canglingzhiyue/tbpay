package tb;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.b;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hgh implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f28614a;
    private TBLiveDataModel b;
    private b c;
    private BottomSheetBehavior d;
    private String e;
    private hgi f;
    private a g;

    static {
        kge.a(542799587);
        kge.a(-1201612728);
    }

    public static /* synthetic */ b a(hgh hghVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("599d8578", new Object[]{hghVar}) : hghVar.c;
    }

    public static /* synthetic */ BottomSheetBehavior b(hgh hghVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BottomSheetBehavior) ipChange.ipc$dispatch("66a7ec95", new Object[]{hghVar}) : hghVar.d;
    }

    public hgh(Context context, TBLiveDataModel tBLiveDataModel, hgi hgiVar, a aVar) {
        this.f28614a = context;
        this.b = tBLiveDataModel;
        this.f = hgiVar;
        this.g = aVar;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c != null) {
        } else {
            View inflate = LayoutInflater.from(this.f28614a).inflate(R.layout.taolive_comment_report_layout_flexalocal, (ViewGroup) null);
            this.c = new b(this.f28614a, R.style.TL_Comments_BottomSheetDialog_flexalocal);
            this.c.setContentView(inflate);
            this.d = BottomSheetBehavior.b((View) inflate.getParent());
            this.d.a(new BottomSheetBehavior.a() { // from class: tb.hgh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public void a(View view, float f) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b3af196", new Object[]{this, view, new Float(f)});
                    }
                }

                @Override // android.support.design.widget.BottomSheetBehavior.a
                public void a(View view, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
                    } else if (i != 5) {
                    } else {
                        hgh.a(hgh.this).dismiss();
                        hgh.b(hgh.this).b(4);
                    }
                }
            });
            inflate.findViewById(R.id.tl_comment_report).setOnClickListener(this);
            inflate.findViewById(R.id.tl_comment_cancel).setOnClickListener(this);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.e = str;
            a();
            this.d.b(3);
            this.c.show();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.tl_comment_report) {
            this.d.b(5);
            b();
            phg.a().a(this.g, "commentreport", new String[0]);
        } else if (view.getId() != R.id.tl_comment_cancel) {
        } else {
            this.d.b(5);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String a2 = ply.a();
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("from", "commentDetail");
        hashMap.put("subjectType", "LIVE_COMMENT");
        hashMap.put(FluidInstanceAnalysis.KEY_SOURCE, this.f.f28616a);
        hashMap.put("subjectId", this.e);
        hashMap.put("reportType", "COMMENT");
        String a3 = pma.a(a2, hashMap);
        String b = ply.b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) a3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("params", jSONObject.toJSONString());
        String a4 = pma.a(b, hashMap2);
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", a4);
        intent.putExtra("param", a4);
        LocalBroadcastManager.getInstance(this.f28614a).sendBroadcast(intent);
    }
}
