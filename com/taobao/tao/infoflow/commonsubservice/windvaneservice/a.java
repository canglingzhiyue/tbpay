package com.taobao.tao.infoflow.commonsubservice.windvaneservice;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.lkz;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f20631a = new ArrayList();
    private ljs b;
    private lkz.a c;
    private IContainerService.a d;

    static {
        kge.a(-898656322);
    }

    public a(ljs ljsVar) {
        this.b = ljsVar;
        b();
        c();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d();
        this.f20631a.clear();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = new lkz.a() { // from class: com.taobao.tao.infoflow.commonsubservice.windvaneservice.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkz.a
            public void a(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
                }
            }

            @Override // tb.lkz.a
            public void a_(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b34bf30d", new Object[]{this, view});
                }
            }

            @Override // tb.lkz.a
            public void b(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
                }
            }

            @Override // tb.lkz.a
            public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
                } else {
                    a.this.a(view, baseSectionModel);
                }
            }
        };
        this.d = new IContainerService.a() { // from class: com.taobao.tao.infoflow.commonsubservice.windvaneservice.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
            public void a(IUiRefreshActionModel iUiRefreshActionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
            public void b(IUiRefreshActionModel iUiRefreshActionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
                } else {
                    a.this.e();
                }
            }
        };
    }

    public void c() {
        IContainerService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.b.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null || this.c == null) {
            return;
        }
        iMainFeedsViewService.mo1084getLifeCycleRegister().a(this.c);
        IContainerService iContainerService = (IContainerService) this.b.a(IContainerService.class);
        if (iContainerService == null || (aVar = this.d) == null) {
            return;
        }
        iContainerService.addUiRefreshListener(aVar);
    }

    public void d() {
        IContainerService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.b.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null || this.c == null) {
            return;
        }
        iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.c);
        IContainerService iContainerService = (IContainerService) this.b.a(IContainerService.class);
        if (iContainerService == null || (aVar = this.d) == null) {
            return;
        }
        iContainerService.removeUiRefreshListener(aVar);
    }

    public void a(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e05c3b2", new Object[]{this, view, baseSectionModel});
        } else if (view == null) {
        } else {
            b(view, baseSectionModel);
        }
    }

    private boolean b(View view, BaseSectionModel<?> baseSectionModel) {
        ICardOverlayService iCardOverlayService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d2c5315", new Object[]{this, view, baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null || (iCardOverlayService = (ICardOverlayService) this.b.a(ICardOverlayService.class)) == null) {
            return false;
        }
        if (b(view)) {
            iCardOverlayService.removeOverlayView("commonOverlay", view);
            c(view);
            ldf.d("浮层日志:", "removeOverlayView:" + System.identityHashCode(view));
        }
        if (!((baseSectionModel.mo1098getSubSection() == null || baseSectionModel.mo1098getSubSection().getWindvaneOverlay() == null) ? false : true)) {
            return false;
        }
        BaseSectionModel windvaneOverlay = baseSectionModel.mo1098getSubSection().getWindvaneOverlay();
        if (iCardOverlayService == null) {
            return false;
        }
        new ArrayList().add(windvaneOverlay);
        ldf.d("浮层日志:", "showOverlay:" + System.identityHashCode(view));
        iCardOverlayService.showOverlay("commonOverlay", view, baseSectionModel);
        a(view);
        return true;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setTag(R.id.tag_view_has_cover, true);
        } else {
            view.setTag(R.id.tag_view_has_cover, true);
        }
    }

    private boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue();
        }
        ViewParent parent = view.getParent();
        return parent instanceof ViewGroup ? ((ViewGroup) parent).getTag(R.id.tag_view_has_cover) != null : view.getTag(R.id.tag_view_has_cover) != null;
    }

    private void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setTag(R.id.tag_view_has_cover, null);
        } else {
            view.setTag(R.id.tag_view_has_cover, null);
        }
    }

    public void e() {
        int[] visiblePositionRange;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.b.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null || (visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange()) == null || visiblePositionRange.length < 2) {
            return;
        }
        int i = visiblePositionRange[1];
        if (((ICardOverlayService) this.b.a(ICardOverlayService.class)) == null) {
            return;
        }
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i2);
            if (findItemDataByPosition != null && findItemDataByPosition.mo1098getSubSection() != null && findItemDataByPosition.mo1098getSubSection().getWindvaneOverlay() != null) {
                String sectionBizCode = findItemDataByPosition.mo1098getSubSection().getWindvaneOverlay().getSectionBizCode();
                if (this.f20631a.contains(sectionBizCode)) {
                    TLog.loge("浮层日志:", "浮层bizCode: 已经展示过" + sectionBizCode);
                } else if (iMainFeedsViewService.findItemViewByPosition(i2) != null && (iMainFeedsViewService.findItemViewByPosition(i2) instanceof ViewGroup) && ((ViewGroup) iMainFeedsViewService.findItemViewByPosition(i2)).getChildCount() > 0) {
                    b(((ViewGroup) iMainFeedsViewService.findItemViewByPosition(i2)).getChildAt(0), findItemDataByPosition);
                    TLog.loge("浮层日志:", "准备展示，浮层bizCode:" + sectionBizCode);
                    this.f20631a.add(sectionBizCode);
                }
            }
        }
    }
}
