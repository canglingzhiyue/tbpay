package com.taobao.avplayer.playercontrol;

import android.os.Handler;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.aw;
import com.taobao.avplayer.common.o;
import com.taobao.avplayer.common.q;
import com.taobao.avplayer.common.w;
import com.taobao.avplayer.common.x;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.core.protocol.DWInteractiveVideoObject;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.HashMap;
import tb.kca;
import tb.kck;
import tb.kcl;
import tb.kco;
import tb.kge;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;

/* loaded from: classes6.dex */
public class DWPlayerController implements Handler.Callback, SeekBar.OnSeekBarChangeListener, aw, q, j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int HIDE_DELAY_TIME = 4000;
    private static final int MSG_HIDE_CONTROLLER = 0;
    private static final String TAG;
    public int duration;
    public a mControllerHolder;
    private DWContext mDWContext;
    private kca mDWNavController;
    private f mDWPlayRateController;
    private i mDWTopBarController;
    private Handler mHandler;
    private com.taobao.avplayer.playercontrol.hiv.e mHivTopBarController;
    private com.taobao.avplayer.playercontrol.hiv.f mHivVideoExtDataBarController;
    private FrameLayout mHost;
    private x mNormalControllerListener;
    private k mPlayerControlListener;
    private int mPositionBFStart;
    private boolean mRequested;
    private boolean mShowItemIcon;
    private int mTotalTime;
    private boolean mUseHiv;
    public boolean startTracking;
    private boolean mHideControllerView = false;
    private DWLifecycleType mDWLifecycleType = DWLifecycleType.BEFORE;
    private int newPosition = 0;

    public View getGoodsListView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cdacfeec", new Object[]{this});
        }
        return null;
    }

    public void hideGoodsListView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183864be", new Object[]{this});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    public void showGoodsListView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bd3463", new Object[]{this});
        }
    }

    public static /* synthetic */ com.taobao.avplayer.playercontrol.hiv.e access$000(DWPlayerController dWPlayerController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.playercontrol.hiv.e) ipChange.ipc$dispatch("b027ae9c", new Object[]{dWPlayerController}) : dWPlayerController.mHivTopBarController;
    }

    public static /* synthetic */ com.taobao.avplayer.playercontrol.hiv.f access$100(DWPlayerController dWPlayerController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.avplayer.playercontrol.hiv.f) ipChange.ipc$dispatch("932fa3c", new Object[]{dWPlayerController}) : dWPlayerController.mHivVideoExtDataBarController;
    }

    public static /* synthetic */ DWContext access$200(DWPlayerController dWPlayerController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWContext) ipChange.ipc$dispatch("bdb66a3a", new Object[]{dWPlayerController}) : dWPlayerController.mDWContext;
    }

    public static /* synthetic */ boolean access$302(DWPlayerController dWPlayerController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15a3f176", new Object[]{dWPlayerController, new Boolean(z)})).booleanValue();
        }
        dWPlayerController.mShowItemIcon = z;
        return z;
    }

    public static /* synthetic */ kca access$400(DWPlayerController dWPlayerController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kca) ipChange.ipc$dispatch("d36eb5dc", new Object[]{dWPlayerController}) : dWPlayerController.mDWNavController;
    }

    public static /* synthetic */ i access$500(DWPlayerController dWPlayerController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("7d0b5063", new Object[]{dWPlayerController}) : dWPlayerController.mDWTopBarController;
    }

    public static /* synthetic */ k access$600(DWPlayerController dWPlayerController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("acc284a2", new Object[]{dWPlayerController}) : dWPlayerController.mPlayerControlListener;
    }

    static {
        kge.a(1192180841);
        kge.a(-123403623);
        kge.a(-1967544404);
        kge.a(-1043440182);
        kge.a(556437024);
        kge.a(-1679379503);
        TAG = DWPlayerController.class.getSimpleName();
    }

    public DWPlayerController(DWContext dWContext) {
        this.mDWContext = dWContext;
        this.mDWContext.initInteractiveOrange();
        this.mDWContext.initVideoOrange();
        initView();
        this.mHandler = new Handler(this);
        this.mUseHiv = !StringUtils.isEmpty(dWContext.mCid);
        if (this.mUseHiv) {
            this.mHivTopBarController = new com.taobao.avplayer.playercontrol.hiv.e(this.mDWContext);
            this.mHivVideoExtDataBarController = new com.taobao.avplayer.playercontrol.hiv.f(this.mDWContext);
            this.mHivVideoExtDataBarController.b();
        } else {
            this.mDWTopBarController = new i(this.mDWContext);
        }
        this.mDWNavController = new kca(this.mDWContext, this.mControllerHolder.e);
        this.mDWPlayRateController = new f(this.mDWContext, this.mHost);
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_sdk_DWPlayerController);
    }

    public void showOrHideInteractive(boolean z) {
        com.taobao.avplayer.playercontrol.hiv.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
        } else if (this.mDWLifecycleType != DWLifecycleType.MID && z) {
        } else {
            if (z) {
                if (!this.mRequested) {
                    if (this.mUseHiv) {
                        getInteractiveDataFromHiv();
                    } else {
                        getInteractiveData();
                    }
                }
                kca kcaVar = this.mDWNavController;
                if (kcaVar != null) {
                    kcaVar.a();
                }
            } else {
                kca kcaVar2 = this.mDWNavController;
                if (kcaVar2 != null) {
                    kcaVar2.b();
                }
            }
            i iVar = this.mDWTopBarController;
            if (iVar != null) {
                iVar.d(z);
            }
            if (this.mDWContext.screenType() != DWVideoScreenType.NORMAL && (eVar = this.mHivTopBarController) != null) {
                eVar.d(z);
            }
            if (this.mHivVideoExtDataBarController == null) {
                return;
            }
            if (z && this.mDWContext.screenType() != DWVideoScreenType.NORMAL) {
                this.mHivVideoExtDataBarController.c();
            } else {
                this.mHivVideoExtDataBarController.b();
            }
        }
    }

    public void setIDWHookVideoBackButtonListener(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6b86f0", new Object[]{this, oVar});
            return;
        }
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            iVar.a(oVar);
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar == null) {
            return;
        }
        eVar.a(oVar);
    }

    public void showTopEventView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2538072e", new Object[]{this});
            return;
        }
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            iVar.a();
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    public void requestInteractiveAndRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca7a73e", new Object[]{this});
        } else {
            showOrHideInteractive(this.mDWContext.isShowInteractive());
        }
    }

    public void hideTopEventView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b7df73", new Object[]{this});
            return;
        }
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            iVar.b();
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar == null) {
            return;
        }
        eVar.b();
    }

    private void getInteractiveDataFromHiv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29ef13c", new Object[]{this});
            return;
        }
        this.mRequested = true;
        this.mDWContext.queryInteractiveDataFromHiv(new w() { // from class: com.taobao.avplayer.playercontrol.DWPlayerController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.w
            public void onError(DWResponse dWResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
                }
            }

            @Override // com.taobao.avplayer.common.w
            public void onSuccess(DWResponse dWResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                    return;
                }
                ContentDetailData b = com.taobao.avplayer.core.protocol.c.b(dWResponse);
                if (b == null) {
                    onError(dWResponse);
                    return;
                }
                if (DWPlayerController.access$000(DWPlayerController.this) != null) {
                    DWPlayerController.access$000(DWPlayerController.this).a(b);
                }
                if (DWPlayerController.access$100(DWPlayerController.this) != null) {
                    DWPlayerController.access$100(DWPlayerController.this).a(b);
                    if (DWPlayerController.access$200(DWPlayerController.this).screenType() == DWVideoScreenType.NORMAL) {
                        DWPlayerController.access$100(DWPlayerController.this).b();
                    }
                }
                if (b.getShopOrTalentRelatedItems() != null && b.getShopOrTalentRelatedItems().size() != 0) {
                    return;
                }
                DWPlayerController.access$100(DWPlayerController.this).d();
            }
        }, false);
    }

    private void getInteractiveData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0419cfd", new Object[]{this});
            return;
        }
        this.mRequested = true;
        this.mDWContext.queryInteractiveData(new w() { // from class: com.taobao.avplayer.playercontrol.DWPlayerController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.avplayer.common.w
            public void onError(DWResponse dWResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1dda8d", new Object[]{this, dWResponse});
                }
            }

            @Override // com.taobao.avplayer.common.w
            public void onSuccess(DWResponse dWResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c6105f72", new Object[]{this, dWResponse});
                    return;
                }
                try {
                    DWInteractiveVideoObject dWInteractiveVideoObject = new DWInteractiveVideoObject(dWResponse.data);
                    if (DWPlayerController.access$200(DWPlayerController.this) != null && DWPlayerController.access$200(DWPlayerController.this).getIctTmpCallback() != null) {
                        HashMap hashMap = new HashMap();
                        String shareData = dWInteractiveVideoObject.getShareData();
                        if (shareData == null) {
                            shareData = "";
                        }
                        hashMap.put("shareData", shareData);
                        String taowaData = dWInteractiveVideoObject.getTaowaData();
                        if (taowaData == null) {
                            taowaData = "";
                        }
                        hashMap.put("taowaData", taowaData);
                        String favorData = dWInteractiveVideoObject.getFavorData();
                        if (favorData == null) {
                            favorData = "";
                        }
                        hashMap.put("favorData", favorData);
                        DWPlayerController.access$200(DWPlayerController.this).getIctTmpCallback().a(hashMap);
                    }
                    DWPlayerController.access$302(DWPlayerController.this, true);
                    if (DWPlayerController.access$400(DWPlayerController.this) != null) {
                        DWPlayerController.access$400(DWPlayerController.this).a(dWInteractiveVideoObject);
                    }
                    if (DWPlayerController.access$500(DWPlayerController.this) == null) {
                        return;
                    }
                    DWPlayerController.access$500(DWPlayerController.this).a(dWInteractiveVideoObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, false);
    }

    public void setIDWPlayerControlListener(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe69a72", new Object[]{this, kVar});
            return;
        }
        this.mPlayerControlListener = kVar;
        f fVar = this.mDWPlayRateController;
        if (fVar == null) {
            return;
        }
        fVar.a(this);
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mHost;
    }

    public View getTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("22e0bf6d", new Object[]{this});
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar != null) {
            return eVar.e();
        }
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            return iVar.e();
        }
        return new View(this.mDWContext.getActivity());
    }

    public View getRightView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1701daf4", new Object[]{this});
        }
        com.taobao.avplayer.playercontrol.hiv.f fVar = this.mHivVideoExtDataBarController;
        if (fVar != null) {
            return fVar.a();
        }
        return new View(this.mDWContext.getActivity());
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mHost = (FrameLayout) LayoutInflater.from(this.mDWContext.getActivity()).inflate(R.layout.tbavsdk_video_bottom_controller, (ViewGroup) null, false);
        this.mControllerHolder = new a();
        a aVar = this.mControllerHolder;
        FrameLayout frameLayout = this.mHost;
        aVar.f16562a = frameLayout;
        aVar.b = frameLayout.findViewById(R.id.video_controller_layout);
        this.mControllerHolder.d = (TextView) this.mHost.findViewById(R.id.video_controller_current_time);
        this.mControllerHolder.c = (TextView) this.mHost.findViewById(R.id.video_controller_total_time);
        this.mControllerHolder.e = (SeekBar) this.mHost.findViewById(R.id.video_controller_seekBar);
        this.mControllerHolder.e.setEnabled(false);
        this.mControllerHolder.f = (FrameLayout) this.mHost.findViewById(R.id.video_controller_fullscreen);
        this.mControllerHolder.g = new ImageView(this.mDWContext.getActivity());
        int a2 = kcl.a(this.mDWContext.getActivity(), 2.0f);
        this.mControllerHolder.g.setPadding(a2, a2, a2, a2);
        this.mControllerHolder.f.addView(this.mControllerHolder.g, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = this.mControllerHolder.f;
        if (!this.mDWContext.mNeedScreenButton) {
            i = 4;
        }
        frameLayout2.setVisibility(i);
        if (!this.mDWContext.mNeedScreenButton) {
            this.mControllerHolder.f.getLayoutParams().width = kcl.a(this.mDWContext.getActivity(), 12.0f);
        }
        this.mControllerHolder.h = R.drawable.tbavsdk_video_fullscreen;
        this.mControllerHolder.i = R.drawable.tbavsdk_video_unfullscreen;
        if (this.mDWContext.mDWImageAdapter != null) {
            this.mDWContext.mDWImageAdapter.a(this.mControllerHolder.h, this.mControllerHolder.g);
        } else {
            this.mControllerHolder.g.setImageResource(this.mControllerHolder.h);
        }
        if (this.mControllerHolder.g != null) {
            this.mControllerHolder.g.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.avplayer.playercontrol.DWPlayerController.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (DWPlayerController.access$600(DWPlayerController.this) == null) {
                    } else {
                        DWPlayerController.access$600(DWPlayerController.this).a();
                    }
                }
            });
        }
        if (this.mControllerHolder.e == null) {
            return;
        }
        this.mControllerHolder.e.setOnSeekBarChangeListener(this);
        this.mControllerHolder.e.setMax(1000);
    }

    public void addFullScreenCustomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
        } else if (view == null || this.mControllerHolder.f == null) {
        } else {
            this.mControllerHolder.f.removeAllViews();
            this.mControllerHolder.f.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void removeFullScreenCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
        } else if (this.mControllerHolder.f == null) {
        } else {
            this.mControllerHolder.f.removeAllViews();
            this.mControllerHolder.f.addView(this.mControllerHolder.g);
        }
    }

    public void setCloseViewClickListener(com.taobao.avplayer.common.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b86bd5f2", new Object[]{this, cVar});
            return;
        }
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            iVar.a(cVar);
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar == null) {
            return;
        }
        eVar.a(cVar);
    }

    public boolean showing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27ce99d0", new Object[]{this})).booleanValue() : this.mControllerHolder.b.getVisibility() == 0;
    }

    public void hideControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f2dd4a", new Object[]{this});
            return;
        }
        this.mHideControllerView = true;
        hideControllerInner();
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            iVar.c();
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar == null) {
            return;
        }
        eVar.c();
    }

    public void showControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67080245", new Object[]{this});
            return;
        }
        this.mHideControllerView = false;
        showControllerInner();
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            iVar.d();
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar == null) {
            return;
        }
        eVar.d();
    }

    public void showControllerInner() {
        a aVar;
        com.taobao.avplayer.playercontrol.hiv.f fVar;
        com.taobao.avplayer.playercontrol.hiv.e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb064d64", new Object[]{this});
        } else if (this.mHideControllerView || showing() || (aVar = this.mControllerHolder) == null) {
        } else {
            aVar.b.setVisibility(0);
            i iVar = this.mDWTopBarController;
            if (iVar != null) {
                iVar.a(true);
            }
            com.taobao.avplayer.playercontrol.hiv.e eVar2 = this.mHivTopBarController;
            if (eVar2 != null) {
                eVar2.a(true);
            }
            if (this.mDWContext.screenType() != DWVideoScreenType.NORMAL && (eVar = this.mHivTopBarController) != null) {
                eVar.d(true);
            }
            if (this.mDWContext.screenType() != DWVideoScreenType.NORMAL && (fVar = this.mHivVideoExtDataBarController) != null) {
                fVar.c();
            }
            if (this.mDWContext.screenType() == DWVideoScreenType.NORMAL && !this.mDWContext.isMute()) {
                showCloseView(false);
            } else {
                i iVar2 = this.mDWTopBarController;
                if (iVar2 != null) {
                    iVar2.e(true);
                }
                com.taobao.avplayer.playercontrol.hiv.e eVar3 = this.mHivTopBarController;
                if (eVar3 != null) {
                    eVar3.e(true);
                }
            }
            x xVar = this.mNormalControllerListener;
            if (xVar != null) {
                xVar.b();
            }
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.removeMessages(0);
            this.mHandler.sendEmptyMessageDelayed(0, Constants.STARTUP_TIME_LEVEL_1);
        }
    }

    public void hideControllerInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d76d2ff", new Object[]{this});
        } else if (!showing()) {
        } else {
            DWContext dWContext = this.mDWContext;
            if (dWContext != null && dWContext.getVideo() != null && this.mDWContext.getVideo().t() != 3) {
                hideCloseView(false);
            }
            i iVar = this.mDWTopBarController;
            if (iVar != null) {
                iVar.a(false);
                this.mDWTopBarController.e(false);
            }
            this.mControllerHolder.b.setVisibility(4);
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeMessages(0);
            }
            x xVar = this.mNormalControllerListener;
            if (xVar == null) {
                return;
            }
            xVar.a();
        }
    }

    public void hideCloseView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee652a72", new Object[]{this, new Boolean(z)});
            return;
        }
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            iVar.c(z);
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar == null) {
            return;
        }
        eVar.c(z);
    }

    public void showCloseView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b204ed", new Object[]{this, new Boolean(z)});
            return;
        }
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            iVar.b(z);
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar == null) {
            return;
        }
        eVar.b(z);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(this.mDWContext.getVideoToken()) && this.duration == 0) {
            this.duration = this.mDWContext.getVideo().n();
            this.mControllerHolder.c.setText(kco.a(this.duration));
        }
        this.mControllerHolder.e.setEnabled(true);
        hideControllerInner();
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, Constants.STARTUP_TIME_LEVEL_1);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(this.mDWContext.getVideoToken()) && this.duration == 0) {
            this.duration = this.mDWContext.getVideo().n();
            this.mControllerHolder.c.setText(kco.a(this.duration));
        }
        this.mControllerHolder.e.setEnabled(true);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        this.mControllerHolder.e.setEnabled(true);
        int i = this.duration;
        if (i == 0) {
            i = (int) ((AbstractMediaPlayer) obj).getDuration();
        }
        this.duration = i;
        if (this.duration < 0) {
            return;
        }
        this.mControllerHolder.c.setText(kco.a(this.duration));
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        resetViewState();
        if (this.mDWContext.screenType() != DWVideoScreenType.NORMAL || this.mDWContext.isMute()) {
            return;
        }
        showCloseView(false);
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        } else {
            this.mControllerHolder.e.setEnabled(false);
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        } else {
            this.newPosition = 0;
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else if (dWVideoScreenType == DWVideoScreenType.NORMAL) {
            onVideoNormalScreen();
        } else {
            onVideoFullScreen(dWVideoScreenType);
        }
    }

    private void onVideoFullScreen(DWVideoScreenType dWVideoScreenType) {
        com.taobao.avplayer.playercontrol.hiv.f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f57cdb", new Object[]{this, dWVideoScreenType});
            return;
        }
        if (DWVideoScreenType.LANDSCAPE_FULL_SCREEN == dWVideoScreenType) {
            updatePlayerController(true);
            updateUIHivTopBar(true);
        } else if (DWVideoScreenType.PORTRAIT_FULL_SCREEN == dWVideoScreenType) {
            updateUIHivTopBar(false);
        }
        if (this.mControllerHolder.g != null) {
            if (this.mDWContext.mDWImageAdapter != null) {
                this.mDWContext.mDWImageAdapter.a(this.mControllerHolder.i, this.mControllerHolder.g);
            } else {
                this.mControllerHolder.g.setImageResource(this.mControllerHolder.i);
            }
        }
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            iVar.e(true);
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar != null) {
            eVar.e(true);
        }
        hideCloseView(false);
        i iVar2 = this.mDWTopBarController;
        if (iVar2 != null) {
            iVar2.a(20);
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar2 = this.mHivTopBarController;
        if (eVar2 != null) {
            eVar2.a(20);
        }
        if (this.mDWContext.screenType() == DWVideoScreenType.NORMAL || (fVar = this.mHivVideoExtDataBarController) == null) {
            return;
        }
        fVar.c();
    }

    private void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            return;
        }
        updatePlayerController(false);
        if (this.mControllerHolder.g != null) {
            if (this.mDWContext.mDWImageAdapter != null) {
                this.mDWContext.mDWImageAdapter.a(this.mControllerHolder.h, this.mControllerHolder.g);
            } else {
                this.mControllerHolder.g.setImageResource(this.mControllerHolder.h);
            }
        }
        i iVar = this.mDWTopBarController;
        if (iVar != null) {
            iVar.e(false);
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
        if (eVar != null) {
            eVar.e(false);
        }
        if (!this.mDWContext.isMute()) {
            showCloseView(false);
        }
        i iVar2 = this.mDWTopBarController;
        if (iVar2 != null) {
            iVar2.a(12);
        }
        com.taobao.avplayer.playercontrol.hiv.e eVar2 = this.mHivTopBarController;
        if (eVar2 != null) {
            eVar2.a(12);
        }
        com.taobao.avplayer.playercontrol.hiv.f fVar = this.mHivVideoExtDataBarController;
        if (fVar == null) {
            return;
        }
        fVar.b();
    }

    private void updatePlayerController(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404bbaa7", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.mControllerHolder;
        if (aVar == null) {
            return;
        }
        if (z) {
            aVar.b.getLayoutParams().height = kcl.a(this.mDWContext.getActivity(), 68.0f);
            this.mControllerHolder.d.setTextSize(2, 14.0f);
            this.mControllerHolder.c.setTextSize(2, 14.0f);
            if (this.mDWContext.mNeedScreenButton) {
                this.mControllerHolder.f.getLayoutParams().width = kcl.a(this.mDWContext.getActivity(), 40.0f);
            } else {
                this.mControllerHolder.f.getLayoutParams().width = kcl.a(this.mDWContext.getActivity(), 14.0f);
            }
            this.mControllerHolder.f.getLayoutParams().height = kcl.a(this.mDWContext.getActivity(), 40.0f);
            this.mControllerHolder.f16562a.requestLayout();
            return;
        }
        aVar.b.getLayoutParams().height = kcl.a(this.mDWContext.getActivity(), 48.0f);
        this.mControllerHolder.d.setTextSize(2, 10.0f);
        this.mControllerHolder.c.setTextSize(2, 10.0f);
        if (this.mDWContext.mNeedScreenButton) {
            this.mControllerHolder.f.getLayoutParams().width = kcl.a(this.mDWContext.getActivity(), 30.0f);
        } else {
            this.mControllerHolder.f.getLayoutParams().width = kcl.a(this.mDWContext.getActivity(), 12.0f);
        }
        this.mControllerHolder.f.getLayoutParams().height = -1;
        this.mControllerHolder.f16562a.requestLayout();
    }

    private void updateUIHivTopBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4319717", new Object[]{this, new Boolean(z)});
        } else {
            if (this.mHivTopBarController == null) {
            }
        }
    }

    @Override // com.taobao.avplayer.aw
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.startTracking) {
        } else {
            this.mTotalTime = i3;
            if (i > i3) {
                i = i3;
            }
            this.mControllerHolder.d.setText(kco.a(i));
            this.mControllerHolder.e.setProgress((int) Math.ceil(((i * 1.0f) / i3) * 1000.0f));
            this.mControllerHolder.e.setSecondaryProgress(i2 * 10);
            this.newPosition = i;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
            return;
        }
        this.startTracking = true;
        if (kck.a()) {
            com.taobao.taobaoavsdk.util.c.a(TAG, "onProgressChanged --- onStartTrackingTouch ");
        }
        DWContext dWContext = this.mDWContext;
        if (dWContext == null || dWContext.getVideo() == null) {
            return;
        }
        this.mPositionBFStart = this.mDWContext.getVideo().o();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.mTotalTime;
        if (i2 < 0 || !z) {
            return;
        }
        this.newPosition = (int) (i2 * (i / 1000.0f));
        if (kck.a()) {
            String str = TAG;
            com.taobao.taobaoavsdk.util.c.a(str, "onProgressChanged >>> progress:" + i + ", newPosition:" + this.newPosition);
        }
        a aVar = this.mControllerHolder;
        if (aVar != null) {
            aVar.d.setText(kco.a(this.newPosition));
        }
        if (!this.mDWContext.isInstantSeekingEnable() || (kVar = this.mPlayerControlListener) == null) {
            return;
        }
        kVar.b(this.newPosition);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        this.startTracking = false;
        if (this.mPlayerControlListener != null) {
            if (this.mDWContext.isInstantSeekingEnable()) {
                commitSeekData();
            }
            this.mPlayerControlListener.a(this.newPosition);
            if (kck.a()) {
                com.taobao.taobaoavsdk.util.c.a(TAG, "onProgressChanged --- onStopTrackingTouch ");
            }
        }
        showControllerInner();
    }

    public void commitSeekData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c22ca0", new Object[]{this});
            return;
        }
        DWContext dWContext = this.mDWContext;
        if (dWContext == null || dWContext.mUTAdapter == null || this.mDWContext.getVideo() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String str = "1";
        hashMap.put("type", str);
        int i = this.mPositionBFStart;
        int i2 = this.newPosition;
        if (i <= i2) {
            str = i == i2 ? "2" : "0";
        }
        hashMap.put("progress", str);
        hashMap.put("mute", this.mDWContext.isMute() ? "true" : "false");
        this.mDWContext.mUTAdapter.a("DWVideo", "Button", "videoProgress", this.mDWContext.getUTParams(), hashMap);
    }

    private void resetViewState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd1264", new Object[]{this});
            return;
        }
        this.newPosition = 0;
        this.mControllerHolder.d.setText(kco.a(0));
        this.mControllerHolder.e.setProgress(0);
        this.mControllerHolder.e.setSecondaryProgress(0);
        this.mControllerHolder.e.setEnabled(false);
    }

    public void setNormalControllerListener(x xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c424055", new Object[]{this, xVar});
        } else {
            this.mNormalControllerListener = xVar;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (kck.a()) {
            String str = TAG;
            com.taobao.taobaoavsdk.util.c.a(str, "handleMessage >>> what:" + String.valueOf(message.what) + "," + message.toString());
        }
        if (message.what == 0) {
            hideControllerInner();
        }
        return false;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.mHandler = null;
    }

    @Override // com.taobao.avplayer.common.q
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        com.taobao.avplayer.playercontrol.hiv.f fVar;
        com.taobao.avplayer.playercontrol.hiv.f fVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        this.mDWLifecycleType = dWLifecycleType;
        if (this.mDWLifecycleType == DWLifecycleType.BEFORE) {
            this.mHost.setVisibility(8);
            i iVar = this.mDWTopBarController;
            if (iVar != null) {
                iVar.c();
            }
            com.taobao.avplayer.playercontrol.hiv.e eVar = this.mHivTopBarController;
            if (eVar != null) {
                eVar.c();
            }
            com.taobao.avplayer.playercontrol.hiv.f fVar3 = this.mHivVideoExtDataBarController;
            if (fVar3 != null) {
                fVar3.b();
            }
            showOrHideInteractive(this.mDWContext.isShowInteractive());
        } else if (this.mDWLifecycleType == DWLifecycleType.MID || this.mDWLifecycleType == DWLifecycleType.AFTER) {
            this.mHost.setVisibility(0);
            if (!this.mHideControllerView) {
                i iVar2 = this.mDWTopBarController;
                if (iVar2 != null) {
                    iVar2.d();
                }
                com.taobao.avplayer.playercontrol.hiv.e eVar2 = this.mHivTopBarController;
                if (eVar2 != null) {
                    eVar2.d();
                }
                if (this.mDWContext.screenType() != DWVideoScreenType.NORMAL && (fVar = this.mHivVideoExtDataBarController) != null) {
                    fVar.c();
                }
            }
            showOrHideInteractive(this.mDWContext.isShowInteractive());
            if (this.mDWLifecycleType == DWLifecycleType.AFTER && (this.mDWContext.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.mDWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN)) {
                i iVar3 = this.mDWTopBarController;
                if (iVar3 != null) {
                    iVar3.e(true);
                }
                com.taobao.avplayer.playercontrol.hiv.e eVar3 = this.mHivTopBarController;
                if (eVar3 != null) {
                    eVar3.e(true);
                }
                com.taobao.avplayer.playercontrol.hiv.f fVar4 = this.mHivVideoExtDataBarController;
                if (fVar4 != null) {
                    fVar4.b();
                }
            }
            if (this.mDWContext.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN && this.mDWContext.screenType() != DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                return;
            }
            com.taobao.avplayer.playercontrol.hiv.e eVar4 = this.mHivTopBarController;
            if (eVar4 != null) {
                eVar4.d(false);
            }
            com.taobao.avplayer.playercontrol.hiv.f fVar5 = this.mHivVideoExtDataBarController;
            if (fVar5 == null) {
                return;
            }
            fVar5.b();
        } else if (this.mDWLifecycleType != DWLifecycleType.MID_BEGIN && this.mDWLifecycleType != DWLifecycleType.MID_END) {
        } else {
            this.mHost.setVisibility(8);
            if (!this.mHideControllerView) {
                i iVar4 = this.mDWTopBarController;
                if (iVar4 != null) {
                    iVar4.d();
                }
                com.taobao.avplayer.playercontrol.hiv.e eVar5 = this.mHivTopBarController;
                if (eVar5 != null) {
                    eVar5.d();
                }
                if (this.mDWContext.screenType() != DWVideoScreenType.NORMAL && (fVar2 = this.mHivVideoExtDataBarController) != null) {
                    fVar2.c();
                }
            }
            showOrHideInteractive(false);
        }
    }

    public int getNormalControllerHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcda1a5a", new Object[]{this})).intValue();
        }
        if (DWVideoScreenType.LANDSCAPE_FULL_SCREEN == this.mDWContext.screenType()) {
            return kcl.a(this.mDWContext.getActivity(), 68.0f);
        }
        return kcl.a(this.mDWContext.getActivity(), 48.0f);
    }

    @Override // com.taobao.avplayer.playercontrol.j
    public boolean onPlayRateChanged(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1876bc", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (this.mPlayerControlListener == null) {
            return false;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(0);
            this.mHandler.sendEmptyMessageDelayed(0, Constants.STARTUP_TIME_LEVEL_1);
        }
        return this.mPlayerControlListener.a(f);
    }
}
