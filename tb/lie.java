package tb;

import android.support.v7.widget.StaggeredGridLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class lie {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30647a;
    private float b;

    static {
        kge.a(816339317);
    }

    public lie() {
        this.f30647a = true;
        this.b = 0.6666667f;
        this.f30647a = ldj.a("columnTypeFallbackEnable", true);
        this.b = ldj.a("oneColumnTypeWidthRatioThreshold", 0.6666667f);
    }

    public void a(BaseSectionModel baseSectionModel, final lib libVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16ffb7b", new Object[]{this, baseSectionModel, libVar});
            return;
        }
        StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) libVar.itemView.getLayoutParams();
        boolean a2 = a(baseSectionModel, libVar.b() == null ? layoutParams : libVar.b().getLayoutParams(), libVar.itemView);
        if (layoutParams != null && layoutParams.isFullSpan() != a2) {
            layoutParams.setFullSpan(a2);
        }
        a(libVar.itemView, baseSectionModel, a2);
        libVar.itemView.post(new Runnable() { // from class: tb.lie.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    libVar.itemView.setTag(R.id.tag_info_flow_card_height, Integer.valueOf(libVar.itemView.getHeight()));
                }
            }
        });
    }

    private void a(View view, BaseSectionModel baseSectionModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b36562", new Object[]{this, view, baseSectionModel, new Boolean(z)});
        } else if (!(view instanceof FrameLayout)) {
        } else {
            if (z) {
                view.setPadding(0, 0, 0, 0);
            } else if (baseSectionModel.getExt() == null) {
            } else {
                try {
                    ((FrameLayout) view).setClipChildren(false);
                    ((FrameLayout) view).setClipToPadding(false);
                    ((ViewGroup) ((FrameLayout) view).getChildAt(0)).setClipChildren(false);
                    ((ViewGroup) ((FrameLayout) view).getChildAt(0)).setClipToPadding(false);
                } catch (Throwable th) {
                    ldf.d("FullSpanHelper", "decorateView error t :" + th.getMessage());
                }
            }
        }
    }

    private boolean a(BaseSectionModel baseSectionModel, ViewGroup.LayoutParams layoutParams, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2e80cc9", new Object[]{this, baseSectionModel, layoutParams, view})).booleanValue();
        }
        if (baseSectionModel == null || layoutParams == null || view == null) {
            return false;
        }
        if (a(baseSectionModel)) {
            return true;
        }
        return a(baseSectionModel.mo1099getTemplate()) || (this.f30647a && (((float) a(view, R.id.tag_info_flow_decoration_width, layoutParams.width)) > (((float) gbg.b(view.getContext())) * this.b) ? 1 : (((float) a(view, R.id.tag_info_flow_decoration_width, layoutParams.width)) == (((float) gbg.b(view.getContext())) * this.b) ? 0 : -1)) > 0);
    }

    private boolean a(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc98adb4", new Object[]{this, baseSectionModel})).booleanValue();
        }
        String sectionBizCode = baseSectionModel.getSectionBizCode();
        if (sectionBizCode == null) {
            return false;
        }
        char c = 65535;
        int hashCode = sectionBizCode.hashCode();
        if (hashCode != -1868198634) {
            if (hashCode != 96784904) {
                if (hashCode == 336650556 && sectionBizCode.equals("loading")) {
                    c = 1;
                }
            } else if (sectionBizCode.equals("error")) {
                c = 0;
            }
        } else if (sectionBizCode.equals("sub_tab")) {
            c = 2;
        }
        return c == 0 || c == 1 || c == 2;
    }

    private boolean a(BaseTemplateModel baseTemplateModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5e8271", new Object[]{this, baseTemplateModel})).booleanValue();
        }
        if (baseTemplateModel != null) {
            return StringUtils.equals("one", baseTemplateModel.getColumnType());
        }
        return false;
    }

    private int a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c25113d", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            return view.getTag(i) == null ? i2 : ((Integer) view.getTag(i)).intValue();
        } catch (Throwable th) {
            ldf.d("FullSpanHelper", "getTagValue error : " + th.getMessage());
            return i2;
        }
    }
}
