package com.taobao.android.live.plugin.atype.flexalocal.bottom.guide;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.SideGudieInfo;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.List;
import tb.ddv;
import tb.kge;
import tb.phg;
import tb.phj;
import tb.pqj;
import tb.xkw;

/* loaded from: classes5.dex */
public class BottomSlideGuideFrame extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a bottomGuideThread;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface b {
        void a(Object obj, String str, Integer num, long j);
    }

    static {
        kge.a(-1947296884);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(BottomSlideGuideFrame bottomSlideGuideFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -1257959318) {
            super.onDidDisappear();
            return null;
        } else if (hashCode != -309961236) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCleanUp();
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "BottomSlideGuideFrame";
    }

    public static /* synthetic */ void access$000(BottomSlideGuideFrame bottomSlideGuideFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("650eda16", new Object[]{bottomSlideGuideFrame, jSONObject});
        } else {
            bottomSlideGuideFrame.render(jSONObject);
        }
    }

    public static /* synthetic */ void access$100(BottomSlideGuideFrame bottomSlideGuideFrame, JSONObject jSONObject, Integer num, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24300c22", new Object[]{bottomSlideGuideFrame, jSONObject, num, new Long(j)});
        } else {
            bottomSlideGuideFrame.showUT(jSONObject, num, j);
        }
    }

    public static /* synthetic */ void access$200(BottomSlideGuideFrame bottomSlideGuideFrame, Object obj, String str, Integer num, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf80106f", new Object[]{bottomSlideGuideFrame, obj, str, num, new Long(j)});
        } else {
            bottomSlideGuideFrame.handleRenderProcess(obj, str, num, j);
        }
    }

    public BottomSlideGuideFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
    }

    private void render(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cdac773", new Object[]{this, jSONObject});
            return;
        }
        final phj g = phg.g();
        if (g == null) {
            q.b("BottomSlideGuideFrame", "BottomSlideGuideFrame: dxRenderEngine is null!");
        } else {
            g.a(this.mContext, "taolive_up_down_bottom_guide", new phj.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideGuideFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.phj.a
                public void onCreateView(DXRootView dXRootView) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                    } else if (!(BottomSlideGuideFrame.this.mContainer instanceof ViewGroup)) {
                    } else {
                        ((ViewGroup) BottomSlideGuideFrame.this.mContainer).removeAllViews();
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        ((ViewGroup) BottomSlideGuideFrame.this.mContainer).addView(dXRootView, layoutParams);
                        g.a(dXRootView, jSONObject);
                    }
                }
            });
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (this.mFrameContext == null || this.mFrameContext.e() == null) {
            return;
        }
        this.mFrameContext.e().a(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (this.mContainer != null) {
            this.mContainer.setVisibility(8);
        }
        a aVar = this.bottomGuideThread;
        if (aVar != null) {
            aVar.interrupt();
            this.bottomGuideThread = null;
        }
        if (this.mFrameContext == null || this.mFrameContext.e() == null) {
            return;
        }
        this.mFrameContext.e().b(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_bottom_guide_layout_flexalocal;
    }

    private void handleRenderProcess(final Object obj, final String str, final Integer num, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a313958b", new Object[]{this, obj, str, num, new Long(j)});
        } else if (this.mContainer == null) {
        } else {
            this.mContainer.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideGuideFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Object obj2 = obj;
                    if (!(obj2 instanceof JSONObject)) {
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) obj2;
                    if (BottomSlideGuideFrame.this.mLiveDataModel != null && BottomSlideGuideFrame.this.mLiveDataModel.mVideoInfo != null) {
                        jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) BottomSlideGuideFrame.this.mLiveDataModel.mVideoInfo.liveId);
                    }
                    jSONObject.put(LoginConstant.ACCOUNT, (Object) str);
                    jSONObject.put("residenceTime", (Object) String.valueOf(num));
                    jSONObject.put("delaytime", (Object) String.valueOf(j));
                    BottomSlideGuideFrame.access$000(BottomSlideGuideFrame.this, jSONObject);
                    BottomSlideGuideFrame.access$100(BottomSlideGuideFrame.this, jSONObject, num, j);
                }
            });
            if (num == null) {
                return;
            }
            this.mContainer.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideGuideFrame.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (BottomSlideGuideFrame.this.mContainer == null) {
                    } else {
                        BottomSlideGuideFrame.this.mContainer.setVisibility(8);
                    }
                }
            }, num.intValue() * 1000);
        }
    }

    private void showUT(JSONObject jSONObject, Integer num, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b22c51a", new Object[]{this, jSONObject, num, new Long(j)});
        } else if (jSONObject == null) {
        } else {
            SideGudieInfo sideGudieInfo = (SideGudieInfo) pqj.a(jSONObject.toJSONString(), SideGudieInfo.class);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("recommendType", sideGudieInfo.recommendType);
            if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.broadCaster != null) {
                hashMap.put(LoginConstant.ACCOUNT, this.mLiveDataModel.mVideoInfo.broadCaster.accountId);
            }
            hashMap.put("showtime", String.valueOf(num));
            hashMap.put("text", pqj.a(sideGudieInfo.recommendTextList));
            hashMap.put("delaytime", String.valueOf(j));
            if (phg.a() == null) {
                return;
            }
            phg.a().a(this.mFrameContext, "Show_swipe_btnbar", hashMap);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 646326426) {
            if (hashCode == 1149358817 && str.equals(xkw.EVENT_UP_AND_DOWN_GUIDE_BOTTOM_EVENT)) {
                c = 1;
            }
        } else if (str.equals(xkw.EVENT_UP_AND_DOWN_GUIDE_BOTTOM_CLOSE_EVENT)) {
            c = 0;
        }
        if (c == 0) {
            if (this.mContainer == null) {
                return;
            }
            this.mContainer.setVisibility(8);
        } else if (c != 1) {
        } else {
            if (this.mFrameContext != null && !this.mFrameContext.z) {
                return;
            }
            if (this.mContainer != null) {
                this.mContainer.setVisibility(0);
            }
            this.bottomGuideThread = new a(this.mFrameContext, this.mLiveDataModel, new b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideGuideFrame.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideGuideFrame.b
                public void a(Object obj2, String str2, Integer num, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a829cb3b", new Object[]{this, obj2, str2, num, new Long(j)});
                    } else {
                        BottomSlideGuideFrame.access$200(BottomSlideGuideFrame.this, obj2, str2, num, j);
                    }
                }
            }, obj, "BottomGuideThread");
            this.bottomGuideThread.start();
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.alilive.aliliveframework.frame.a f13595a;
        public TBLiveDataModel b;
        public b c;
        public Object d;

        static {
            kge.a(400095683);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, b bVar, Object obj, String str) {
            this.f13595a = aVar;
            this.b = tBLiveDataModel;
            this.c = bVar;
            this.d = obj;
            setName(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Object obj = this.d;
            if (obj == null) {
                return;
            }
            a(obj);
        }

        private void a(Object obj) {
            JSONObject b;
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
                return;
            }
            com.taobao.alilive.aliliveframework.frame.a aVar = this.f13595a;
            if (aVar == null || aVar.A == null) {
                return;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                List<SideGudieInfo> take = this.f13595a.A.take();
                long currentTimeMillis2 = (System.currentTimeMillis() - currentTimeMillis) / 1000;
                String str = "mFrameContext.nextSideGudieInfo" + currentTimeMillis2;
                if (take == null || take.size() <= 0 || this.b == null || this.b.mVideoInfo == null || this.b.mVideoInfo.broadCaster == null) {
                    return;
                }
                String str2 = this.b.mVideoInfo.broadCaster.accountId;
                if (StringUtils.isEmpty(obj.toString()) || (b = pqj.b(obj.toString())) == null) {
                    return;
                }
                JSONArray jSONArray = b.getJSONArray("anchorBlacklist");
                Integer integer = b.getInteger("residenceTime");
                SideGudieInfo sideGudieInfo = take.get(0);
                if (jSONArray != null && jSONArray.contains(str2)) {
                    while (true) {
                        if (i >= take.size()) {
                            break;
                        } else if (!"anchorName".equals(take.get(i).recommendType)) {
                            sideGudieInfo = take.get(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                Object b2 = pqj.b(sideGudieInfo);
                if (this.c == null) {
                    return;
                }
                this.c.a(b2, str2, integer, currentTimeMillis2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        if (this.mContainer == null) {
            return;
        }
        this.mContainer.setVisibility(8);
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_UP_AND_DOWN_GUIDE_BOTTOM_CLOSE_EVENT, xkw.EVENT_UP_AND_DOWN_GUIDE_BOTTOM_EVENT};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : this.mFrameContext == null ? "" : this.mFrameContext.G();
    }
}
