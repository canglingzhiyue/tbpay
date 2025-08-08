package com.taobao.android.detail.aligallery;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.c;
import com.taobao.android.detail.ttdetail.component.module.h;
import com.taobao.android.detail.ttdetail.e;
import com.taobao.android.detail.ttdetail.utils.a;
import tb.dwg;
import tb.dwh;
import tb.dwi;
import tb.eyq;
import tb.eyx;
import tb.kge;
import tb.odg;

/* loaded from: classes4.dex */
public class AliGalleryContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AliGalleryContainer";
    private e mContainer;
    private Context mContext;
    private volatile String mCurrentPropPath;
    private eyq.a mFrameSelectListener;
    private boolean mIsRendered;
    private e.a mOnReceiveShareMessage;
    private dwi mPropPathSelectedListener;
    private dwg mRenderListener;
    private dwh mShareListener;

    static {
        kge.a(-1425000739);
    }

    public static /* synthetic */ dwg access$000(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dwg) ipChange.ipc$dispatch("f979da09", new Object[]{aliGalleryContainer}) : aliGalleryContainer.mRenderListener;
    }

    public static /* synthetic */ boolean access$100(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f98454ae", new Object[]{aliGalleryContainer})).booleanValue() : aliGalleryContainer.mIsRendered;
    }

    public static /* synthetic */ boolean access$102(AliGalleryContainer aliGalleryContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33c8fb2c", new Object[]{aliGalleryContainer, new Boolean(z)})).booleanValue();
        }
        aliGalleryContainer.mIsRendered = z;
        return z;
    }

    public static /* synthetic */ dwi access$200(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dwi) ipChange.ipc$dispatch("fe0f4405", new Object[]{aliGalleryContainer}) : aliGalleryContainer.mPropPathSelectedListener;
    }

    public static /* synthetic */ dwh access$300(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dwh) ipChange.ipc$dispatch("8059f8c5", new Object[]{aliGalleryContainer}) : aliGalleryContainer.mShareListener;
    }

    public static /* synthetic */ String access$400(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fb5c8793", new Object[]{aliGalleryContainer}) : aliGalleryContainer.mCurrentPropPath;
    }

    public static /* synthetic */ e access$500(AliGalleryContainer aliGalleryContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("fe2e75a5", new Object[]{aliGalleryContainer}) : aliGalleryContainer.mContainer;
    }

    public AliGalleryContainer(Context context, String str) {
        this(context, str, null);
    }

    public AliGalleryContainer(Context context, String str, eyx eyxVar) {
        this.mIsRendered = false;
        this.mCurrentPropPath = "";
        this.mFrameSelectListener = new eyq.a() { // from class: com.taobao.android.detail.aligallery.AliGalleryContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.eyq.a
            public void a(h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b6a059af", new Object[]{this, hVar});
                    return;
                }
                if (AliGalleryContainer.access$000(AliGalleryContainer.this) != null && !AliGalleryContainer.access$100(AliGalleryContainer.this)) {
                    AliGalleryContainer.access$000(AliGalleryContainer.this);
                    AliGalleryContainer.access$102(AliGalleryContainer.this, true);
                }
                if (AliGalleryContainer.access$200(AliGalleryContainer.this) == null) {
                    return;
                }
                AliGalleryContainer.access$200(AliGalleryContainer.this).a(a.a(hVar));
            }
        };
        this.mOnReceiveShareMessage = new e.a() { // from class: com.taobao.android.detail.aligallery.AliGalleryContainer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.e.a
            public void a(c cVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("79fe643e", new Object[]{this, cVar});
                } else if (AliGalleryContainer.access$300(AliGalleryContainer.this) == null) {
                } else {
                    AliGalleryContainer.access$300(AliGalleryContainer.this).a(cVar.a(), cVar.b());
                }
            }
        };
        odg.m();
        this.mContext = context;
        this.mContainer = new e(context, str, eyxVar);
        this.mContainer.a(this.mFrameSelectListener);
        this.mContainer.a(this.mOnReceiveShareMessage);
    }

    public void setMtopData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463f33b5", new Object[]{this, jSONObject});
            return;
        }
        this.mIsRendered = false;
        this.mContainer.a(jSONObject);
        this.mContainer.d();
    }

    public void scrollToFrameWithPropPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9637024", new Object[]{this, str});
        } else if (StringUtils.equals(this.mCurrentPropPath, str)) {
        } else {
            this.mCurrentPropPath = str;
            this.mContainer.a().b().a(new Runnable() { // from class: com.taobao.android.detail.aligallery.AliGalleryContainer.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AliGalleryContainer.access$500(AliGalleryContainer.this).b(AliGalleryContainer.access$400(AliGalleryContainer.this));
                    }
                }
            });
        }
    }

    public void updateLightOffPriceInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b4e426", new Object[]{this, str});
        } else {
            this.mContainer.c(str);
        }
    }

    public View getRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("17b33166", new Object[]{this}) : this.mContainer.e();
    }

    public eyx getDetailContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("117c4f3", new Object[]{this}) : this.mContainer.a();
    }

    public void setMiniVideoContainer(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f549c5", new Object[]{this, viewGroup});
        } else {
            this.mContainer.a(viewGroup);
        }
    }

    public void setFloatAnimationContainer(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7761255d", new Object[]{this, viewGroup});
        } else {
            this.mContainer.b(viewGroup);
        }
    }

    public void setOnSkuPropPathSelectedListener(dwi dwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a2d7d4", new Object[]{this, dwiVar});
        } else {
            this.mPropPathSelectedListener = dwiVar;
        }
    }

    public void setOnShareListener(dwh dwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da9d57f4", new Object[]{this, dwhVar});
        } else {
            this.mShareListener = dwhVar;
        }
    }

    public void pagePause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e7ae6", new Object[]{this, new Boolean(z)});
        } else {
            this.mContainer.a(z);
        }
    }

    public void pageResume(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b47111", new Object[]{this, new Boolean(z)});
        } else {
            this.mContainer.b(z);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mContainer.b();
        }
    }

    public void setRenderListener(dwg dwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91abcaf", new Object[]{this, dwgVar});
        } else {
            this.mRenderListener = dwgVar;
        }
    }

    public void setFixContainerRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572812fc", new Object[]{this, new Float(f)});
        } else {
            this.mContainer.a(f);
        }
    }

    public void setFixContainerRatioPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908bb2d1", new Object[]{this, new Float(f)});
        } else {
            this.mContainer.b(1.0f - f);
        }
    }

    public void setPagerMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c04418", new Object[]{this, new Integer(i)});
        } else {
            this.mContainer.a(i);
        }
    }
}
