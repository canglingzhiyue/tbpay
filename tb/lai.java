package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.protocol.model.section.BasePopTemplateModel;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.utils.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.lad;
import tb.laj;

/* loaded from: classes7.dex */
public class lai implements laj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30431a = false;

    @Override // tb.laj
    public View a(View view, int i, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9a451789", new Object[]{this, view, new Integer(i), iPopData}) : view;
    }

    @Override // tb.laj
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.laj
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // tb.laj
    public View a(ViewGroup viewGroup, IPopData iPopData, kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7ad83704", new Object[]{this, viewGroup, iPopData, kyuVar});
        }
        BasePopSectionModel mo1070fetchPopSection = iPopData.mo1070fetchPopSection();
        if (mo1070fetchPopSection == null || mo1070fetchPopSection.mo1077getTemplate() == null) {
            c.a("DxPopViewProvider ", "render dx pop error, section is empty");
            return null;
        } else if (kyuVar == null) {
            c.a("DxPopViewProvider ", "render dx pop error, engine is empty");
            return null;
        } else {
            View a2 = kyuVar.d().a(viewGroup, mo1070fetchPopSection, new kzq(kyuVar, iPopData));
            c.b("DxPopViewProvider ", "create dx pop view success，" + mo1070fetchPopSection.mo1077getTemplate().toJSONString());
            f.a(mo1070fetchPopSection, (JSONObject) null);
            return a2;
        }
    }

    @Override // tb.laj
    public View a(View view, String str, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e50be94e", new Object[]{this, view, str, iPopData});
        }
        DXWidgetNode b = b.b(view);
        if (b == null) {
            return view;
        }
        long a2 = b.a(str);
        if (a2 == -1) {
            return view;
        }
        b.sendBroadcastEvent(new DXEvent(a2));
        return view;
    }

    @Override // tb.laj
    public void a(kyu kyuVar, final List<IPopData> list, final laj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33efc740", new Object[]{this, kyuVar, list, aVar});
        } else if (list == null || list.isEmpty()) {
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<IPopData> it = list.iterator();
            while (it.hasNext()) {
                IPopData next = it.next();
                if (next.isAllowShow() && next.getPopConfig().getPopContentType() == 1) {
                    BasePopSectionModel mo1070fetchPopSection = next == null ? null : next.mo1070fetchPopSection();
                    if (mo1070fetchPopSection != null) {
                        mo1070fetchPopSection.getExt().put("businessId", (Object) next.getBusinessID());
                        arrayList.add(mo1070fetchPopSection);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            c.a("DxPopViewProvider ", "preload dx templates, size=" + arrayList.size());
            kyuVar.d().a(arrayList, new lad.a() { // from class: tb.lai.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.lad.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    laj.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(list);
                }
            });
        }
    }

    @Override // tb.laj
    public void a(ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80095b98", new Object[]{this, viewGroup, view, new Integer(i)});
            return;
        }
        DXWidgetNode b = b.b(view);
        if (b == null) {
            return;
        }
        DXEvent dXEvent = null;
        if (i == 0 && this.f30431a) {
            dXEvent = new DXEvent(-962581640L);
            this.f30431a = false;
        } else if (i != 0 && !this.f30431a) {
            dXEvent = new DXEvent(-1609878593L);
            this.f30431a = true;
        }
        if (dXEvent == null) {
            return;
        }
        b.sendBroadcastEvent(dXEvent);
    }

    @Override // tb.laj
    public boolean a(View view, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("464c251a", new Object[]{this, view, iPopData})).booleanValue();
        }
        if (iPopData != null && iPopData.valid() && (view instanceof DXRootView)) {
            DXRootView dXRootView = (DXRootView) view;
            BasePopTemplateModel mo1077getTemplate = iPopData.mo1070fetchPopSection().mo1077getTemplate();
            if (mo1077getTemplate != null && dXRootView.getDxTemplateItem() != null && !StringUtils.equals(mo1077getTemplate.getVersion(), String.valueOf(dXRootView.getDxTemplateItem().b))) {
                return true;
            }
        }
        return false;
    }
}
