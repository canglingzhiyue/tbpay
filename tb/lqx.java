package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.homepage.pop.utils.c;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IFeedbackService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.lad;

/* loaded from: classes.dex */
public class lqx implements lad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30842a;
    private IMainFeedsViewService b;
    private IContainerDataService c;
    private IDxItemRenderService d;
    private FrameLayout e;
    private Map<Integer, WeakReference<View>> f = new HashMap();

    static {
        kge.a(1188917649);
        kge.a(-516310575);
    }

    public void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        this.f30842a = ljsVar;
        if (this.f30842a == null) {
            return;
        }
        this.b = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        this.c = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.d = (IDxItemRenderService) ljsVar.a(IDxItemRenderService.class);
    }

    public void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
        } else {
            this.e = frameLayout;
        }
    }

    @Override // tb.lab
    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout == null) {
            return false;
        }
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        return true;
    }

    @Override // tb.lad
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null) {
            return;
        }
        iMainFeedsViewService.scrollToPositionWithOffset(i, i2);
    }

    @Override // tb.lad
    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.getPositionBySectionBizCode(str);
        }
        return -1;
    }

    @Override // tb.lad
    public String a(int i) {
        BaseSectionModel<?> findItemDataByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService != null && (findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i)) != null) {
            return findItemDataByPosition.getSectionBizCode();
        }
        return null;
    }

    @Override // tb.lad
    public View b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42ac29fc", new Object[]{this, new Integer(i)});
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.findItemViewByPosition(i);
        }
        return null;
    }

    @Override // tb.lad
    public int[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this});
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.getVisiblePositionRange();
        }
        return null;
    }

    @Override // tb.lad
    public boolean a(String str, String str2, Object obj) {
        int positionBySectionBizCode;
        BaseSectionModel<?> findItemDataByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4519965c", new Object[]{this, str, str2, obj})).booleanValue();
        }
        if (this.b == null || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || (positionBySectionBizCode = this.b.getPositionBySectionBizCode(str)) < 0 || (findItemDataByPosition = this.b.findItemDataByPosition(positionBySectionBizCode)) == null) {
            return false;
        }
        if (obj == null) {
            findItemDataByPosition.getExt().remove(str2);
        } else {
            findItemDataByPosition.getExt().put(str2, obj);
        }
        return true;
    }

    @Override // tb.lad
    public boolean c(int i) {
        BaseSectionModel<?> findItemDataByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = this.b;
        if (iMainFeedsViewService == null || (findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i)) == null) {
            return false;
        }
        this.b.updateItem(findItemDataByPosition);
        return true;
    }

    @Override // tb.lad
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        ljs ljsVar = this.f30842a;
        if (ljsVar != null && ljsVar.a() != null) {
            return this.f30842a.a().a();
        }
        return null;
    }

    @Override // tb.lad
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        IContainerDataService iContainerDataService = this.c;
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.triggerEvent(str, jSONObject);
    }

    @Override // tb.lad
    public View a(ViewGroup viewGroup, JSONObject jSONObject, Object obj) {
        BaseSectionModel<?> a2;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9922f3c7", new Object[]{this, viewGroup, jSONObject, obj});
        }
        if (this.d == null || (a2 = a(jSONObject)) == null) {
            return null;
        }
        int viewType = this.d.getViewType(a2);
        if (viewType < 0) {
            c.a("SubContainerProvider ", "render dx pop error, template is empty");
            return null;
        }
        boolean d = d();
        if (d) {
            WeakReference<View> weakReference = this.f.get(Integer.valueOf(viewType));
            if (weakReference != null) {
                view = weakReference.get();
                c.a("SubContainerProvider ", "obtain pop view by cache, viewType=" + viewType);
            } else {
                view = null;
            }
            if (view != null && view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
        } else {
            view = null;
        }
        if (view == null) {
            view = this.d.createView(viewGroup, viewType);
            c.a("SubContainerProvider ", "obtain pop view by createView, viewType=" + viewType);
            if (d && view != null) {
                this.f.put(Integer.valueOf(viewType), new WeakReference<>(view));
            }
        }
        if (view == null) {
            c.a("SubContainerProvider ", "create dx pop view error");
            return null;
        }
        view.setTag(PopConst.DX_POP_USER_CONTEXT_TAG, obj);
        this.d.bindData(view, a2);
        return view;
    }

    @Override // tb.lad
    public void a(List<JSONObject> list, final lad.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b4947d", new Object[]{this, list, aVar});
        } else if (!list.isEmpty() && this.d != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (JSONObject jSONObject : list) {
                arrayList.add(a(jSONObject));
            }
            c.a("SubContainerProvider ", "preload dx templates, size=" + list.size());
            this.d.downloadTemplateWithoutPrefetch(arrayList, new IDxItemRenderService.b() { // from class: tb.lqx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    lad.a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a();
                }
            });
        }
    }

    @Override // tb.lad
    public void b(String str) {
        IFeedbackService iFeedbackService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        ljs ljsVar = this.f30842a;
        if (ljsVar == null || (iFeedbackService = (IFeedbackService) ljsVar.a(IFeedbackService.class)) == null) {
            return;
        }
        iFeedbackService.deleteHostCardByBizCode(str);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f.clear();
        }
    }

    private BaseSectionModel a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("8d852056", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return new SectionModel(jSONObject);
        }
        return null;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : ldj.a("enablePopViewCache", true);
    }
}
