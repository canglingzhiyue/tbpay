package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.EditText;
import com.alibaba.ability.localization.b;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.widget.d;
import com.alibaba.android.ultron.trade.presenter.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bby;

/* loaded from: classes2.dex */
public class bdq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POP_SEARCH_HEADER_TAG = "popSearchHeader";
    private static final String e;

    /* renamed from: a  reason: collision with root package name */
    private final bbz f25821a;
    private final bff b;
    private final Context c;
    private a.b d;

    public static /* synthetic */ bbz a(bdq bdqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("3868d63", new Object[]{bdqVar}) : bdqVar.f25821a;
    }

    static {
        kge.a(-1857442310);
        e = b.a(R.string.taobao_app_1028_1_21659);
    }

    public bdq(bbz bbzVar) {
        this.f25821a = bbzVar;
        this.b = bbzVar.l();
        this.c = bbzVar.m();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        final bby d = this.f25821a.x().d();
        if (d == null) {
            return;
        }
        d.a(new bby.b() { // from class: tb.bdq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bby.b
            public void a() {
                JSONObject fields;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                List<IDMComponent> y = bdq.a(bdq.this).x().y();
                if (y == null) {
                    return;
                }
                IDMComponent iDMComponent = null;
                Iterator<IDMComponent> it = y.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    IDMComponent next = it.next();
                    if (bdq.POP_SEARCH_HEADER_TAG.equals(next.getTag())) {
                        iDMComponent = next;
                        break;
                    }
                }
                if (iDMComponent == null || (fields = iDMComponent.getFields()) == null) {
                    return;
                }
                fields.put(Constants.Event.FOCUS, (Object) true);
                fields.put("keyword", (Object) "");
            }

            @Override // tb.bby.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    d.b(this);
                }
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            c();
        }
    }

    public void a(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20852e9", new Object[]{this, bmzVar});
            return;
        }
        IDMComponent c = bmzVar.c();
        if (c == null) {
            return;
        }
        EditText c2 = c(bmzVar);
        if (c2 == null || c2.getText() == null || StringUtils.isEmpty(c2.getText().toString()) || StringUtils.isEmpty(c2.getText().toString().trim())) {
            d.a(this.c, e);
            return;
        }
        c2.clearFocus();
        String trim = c2.getText().toString().trim();
        JSONObject fields = c.getFields();
        if (fields != null) {
            fields.put(Constants.Event.FOCUS, (Object) false);
            fields.put("keyword", (Object) trim);
        }
        bcb n = this.f25821a.n();
        n.b("search_" + trim);
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
        hashMap.put(RequestConfig.IS_POP_LAYER_FIRST_PAGE, "true");
        this.f25821a.x().b(true);
        this.f25821a.b(false, hashMap, new jnv() { // from class: tb.bdq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    return;
                }
                bdq.a(bdq.this).o().a((com.taobao.android.ultron.common.model.b) null);
                bdq.a(bdq.this).x().b(false);
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                } else {
                    bdq.a(bdq.this).x().b(false);
                }
            }
        });
    }

    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        IDMComponent c = bmzVar.c();
        EditText c2 = c(bmzVar);
        if (c == null || c2 == null || c2.getText() == null) {
            return;
        }
        String obj = c2.getText().toString();
        if (c.getFields() == null) {
            return;
        }
        c.getFields().put("keyword", (Object) obj);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<a.b> z = this.f25821a.n().z();
        if (z == null) {
            return;
        }
        ListIterator<a.b> listIterator = z.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next() == this.d) {
                listIterator.remove();
            }
        }
    }

    private EditText c(bmz bmzVar) {
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditText) ipChange.ipc$dispatch("4181d71a", new Object[]{this, bmzVar});
        }
        Object b = bmzVar.b("triggerView");
        if (!(b instanceof DXRootView) || (expandWidgetNode = ((DXRootView) b).getExpandWidgetNode()) == null) {
            return null;
        }
        DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId("input");
        if (queryWidgetNodeByUserId.getDXRuntimeContext() != null) {
            return a(queryWidgetNodeByUserId.getDXRuntimeContext().v());
        }
        return null;
    }

    private EditText a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EditText) ipChange.ipc$dispatch("79d28d99", new Object[]{this, view}) : (EditText) view.findViewWithTag("editText");
    }
}
