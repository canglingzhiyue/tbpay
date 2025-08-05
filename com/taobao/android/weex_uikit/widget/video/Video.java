package com.taobao.android.weex_uikit.widget.video;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.k;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.video.f;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class Video extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public d callback;
    public f.b needRemount;
    public p.b stateCallback;

    public static /* synthetic */ Object ipc$super(Video video, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 474982114) {
            super.onActivityResume();
            return null;
        } else if (hashCode != 1692842255) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityPause();
            return null;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 10;
    }

    public static /* synthetic */ MUSValue access$000(Video video, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("cecee0f0", new Object[]{video, mUSValueArr, new Integer(i)}) : video.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$100(Video video, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("a75fd30f", new Object[]{video, mUSValueArr, new Integer(i)}) : video.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$200(Video video, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("7ff0c52e", new Object[]{video, mUSValueArr, new Integer(i)}) : video.getArgument(mUSValueArr, i);
    }

    static {
        kge.a(843893364);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        hashMap.put(MusLiveVideo.ATTR_CONTROL_BY_LIST, true);
        ATTR_DEF_MAP.put("autoplay", false);
        ATTR_DEF_MAP.put(MusLiveVideo.ATTR_MUTE, false);
        ATTR_DEF_MAP.put("loop", false);
    }

    public Video(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public Object getDefaultAttribute(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("acae82d0", new Object[]{this, str}) : ATTR_DEF_MAP.get(str);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
            return;
        }
        m mVar = new m();
        m mVar2 = new m();
        m mVar3 = new m();
        f.a(uINode, mVar, mVar2, mVar3);
        if (mVar.a()) {
            this.callback = (d) mVar.b();
        }
        if (mVar2.a()) {
            this.stateCallback = (p.b) mVar2.b();
        }
        if (!mVar3.a()) {
            return;
        }
        this.needRemount = (f.b) mVar3.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : f.a(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
        } else {
            f.a(this, mUSDKInstance, (MUSVideoView) obj, this.stateCallback, this.needRemount, this.callback);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        d dVar = this.callback;
        if (dVar == null) {
            return;
        }
        dVar.e();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        d dVar = this.callback;
        if (dVar == null) {
            return;
        }
        dVar.f();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            f.a(this, mUSDKInstance, (MUSVideoView) obj, this.callback, this.stateCallback);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
        } else {
            f.a(this, list, this.needRemount, this.stateCallback, this.callback);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r9.equals(com.uc.webview.export.media.CommandID.seekTo) != false) goto L11;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDispatchMethod(com.taobao.android.weex_uikit.ui.UINode r8, java.lang.String r9, com.taobao.android.weex_framework.MUSValue[] r10) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_uikit.widget.video.Video.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 4
            if (r1 == 0) goto L1b
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r7
            r1[r4] = r8
            r1[r3] = r9
            r1[r2] = r10
            java.lang.String r8 = "3d011af1"
            r0.ipc$dispatch(r8, r1)
            return
        L1b:
            r0 = -1
            int r1 = r9.hashCode()
            switch(r1) {
                case -1249362537: goto L65;
                case -906224877: goto L5b;
                case -905812725: goto L50;
                case 3443508: goto L45;
                case 3540994: goto L3a;
                case 106440182: goto L2f;
                case 1193403983: goto L24;
                default: goto L23;
            }
        L23:
            goto L6f
        L24:
            java.lang.String r1 = "toggleFullScreen"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L6f
            r2 = 1
            goto L70
        L2f:
            java.lang.String r1 = "pause"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L6f
            r2 = 2
            goto L70
        L3a:
            java.lang.String r1 = "stop"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L6f
            r2 = 4
            goto L70
        L45:
            java.lang.String r1 = "play"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L6f
            r2 = 0
            goto L70
        L50:
            java.lang.String r1 = "setFov"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L6f
            r2 = 5
            goto L70
        L5b:
            java.lang.String r1 = "seekTo"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L6f
            goto L70
        L65:
            java.lang.String r1 = "getFov"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L6f
            r2 = 6
            goto L70
        L6f:
            r2 = -1
        L70:
            switch(r2) {
                case 0: goto L8c;
                case 1: goto L88;
                case 2: goto L84;
                case 3: goto L80;
                case 4: goto L7c;
                case 5: goto L78;
                case 6: goto L74;
                default: goto L73;
            }
        L73:
            goto L8f
        L74:
            r7.getFov(r8, r10)
            goto L8f
        L78:
            r7.setFov(r8, r10)
            return
        L7c:
            r7.stop(r8, r10)
            return
        L80:
            r7.seekTo(r8, r10)
            return
        L84:
            r7.pause(r8, r10)
            return
        L88:
            r7.toggleFullScreen(r8, r10)
            return
        L8c:
            r7.play(r8, r10)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.video.Video.onDispatchMethod(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue[]):void");
    }

    public void play(final UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dcde1b5", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.video.Video.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        f.f(uINode);
                    }
                }
            });
        }
    }

    public void toggleFullScreen(final UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b393e910", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.video.Video.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        f.g(uINode);
                    }
                }
            });
        }
    }

    public void pause(final UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b09df7", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.video.Video.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        f.h(uINode);
                    }
                }
            });
        }
    }

    public void seekTo(final UINode uINode, final MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8645d0d4", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.video.Video.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        f.b(uINode, ((Integer) k.a(Video.this.getInstance(), null, Integer.TYPE, Video.access$000(Video.this, mUSValueArr, 0))).intValue());
                    }
                }
            });
        }
    }

    public void stop(final UINode uINode, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7066903", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.video.Video.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        f.i(uINode);
                    }
                }
            });
        }
    }

    public void setFov(final UINode uINode, final MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ff54cc", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.video.Video.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        f.b(uINode, (JSONObject) k.a(Video.this.getInstance(), null, JSONObject.class, Video.access$100(Video.this, mUSValueArr, 0)));
                    }
                }
            });
        }
    }

    public void getFov(final UINode uINode, final MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee9f658", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.video.Video.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        f.a(uINode, (com.taobao.android.weex_framework.bridge.b) k.a(Video.this.getInstance(), null, com.taobao.android.weex_framework.bridge.b.class, Video.access$200(Video.this, mUSValueArr, 0)));
                    }
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fc, code lost:
        if (r9.equals("controls") != false) goto L11;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode r8, java.lang.String r9, com.taobao.android.weex_framework.MUSValue r10) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.video.Video.onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }

    public void setSrc(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4157e12c", new Object[]{this, uINode, mUSValue});
        } else {
            f.b(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setLoop(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3ceda8", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.a(uINode, z);
    }

    public void setMute(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64ae7d3", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.b(uINode, z);
    }

    public void setControls(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88446d6", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.c(uINode, z);
    }

    public void setAutoPlay(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca058a9", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.d(uINode, z);
    }

    public void setVideoId(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b142b5a", new Object[]{this, uINode, mUSValue});
        } else {
            f.c(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setControlByList(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246ce6fe", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.e(uINode, z);
    }

    public void setDelayTime(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef15420", new Object[]{this, uINode, mUSValue});
        } else {
            f.d(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setPlayScenes(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136903f1", new Object[]{this, uINode, mUSValue});
        } else {
            f.e(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setBizFrom(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af078d3", new Object[]{this, uINode, mUSValue});
        } else {
            f.f(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setContentId(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c43d41c", new Object[]{this, uINode, mUSValue});
        } else {
            f.g(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setUtParams(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("247e2b67", new Object[]{this, uINode, mUSValue});
        } else {
            f.a(uINode, (JSONObject) k.a(getInstance(), null, JSONObject.class, mUSValue));
        }
    }

    public void setPoster(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad5679f", new Object[]{this, uINode, mUSValue});
        } else {
            f.h(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setObjectFit(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5fda8fe", new Object[]{this, uINode, mUSValue});
        } else {
            f.i(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setShowFullscreenBtn(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd066ec", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.f(uINode, z);
    }

    public void setShowPlayBtn(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ac6225", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.g(uINode, z);
    }

    public void setShowCenterPlayBtn(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a1dc35a", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.h(uINode, z);
    }

    public void setShowMuteBtn(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7fe78a", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.i(uINode, z);
    }

    public void setEnablePan(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97ee36", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.j(uINode, z);
    }

    public void setPanoType(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e2e480", new Object[]{this, uINode, mUSValue});
        } else {
            f.j(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setShowPlayRateBtn(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643d81a5", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        f.k(uINode, z);
    }

    public void setVideoSource(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c354da", new Object[]{this, uINode, mUSValue});
        } else {
            f.k(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 114148) {
            if (hashCode != 104264043) {
                if (hashCode == 452782838 && str.equals("videoId")) {
                    c = 2;
                }
            } else if (str.equals(MusLiveVideo.ATTR_MUTE)) {
                c = 1;
            }
        } else if (str.equals("src")) {
            c = 0;
        }
        if (c == 0) {
            refreshSrc(uINode, obj, obj2);
        } else if (c == 1) {
            refreshMute(uINode, obj, obj2);
        } else if (c != 2) {
        } else {
            refreshVideoId(uINode, obj, obj2);
        }
    }

    public void refreshSrc(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df32e30", new Object[]{this, uINode, obj, obj2});
        } else {
            f.a(uINode, (MUSVideoView) obj, (String) obj2, this.needRemount);
        }
    }

    public void refreshMute(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66e9b05", new Object[]{this, uINode, obj, obj2});
        } else {
            f.a(uINode, (MUSVideoView) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void refreshVideoId(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ce1de", new Object[]{this, uINode, obj, obj2});
        } else {
            f.b(uINode, (MUSVideoView) obj, (String) obj2, this.needRemount);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    /* loaded from: classes6.dex */
    public static class a extends com.taobao.android.weex_uikit.ui.b<Video> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-346275170);
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "[\"play\",\"toggleFullScreen\",\"pause\",\"seekTo\",\"stop\",\"setFov\",\"getFov\"]";
        }

        @Override // com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : b(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        public Video b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Video) ipChange.ipc$dispatch("350aac3f", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Video video = new Video(i);
            video.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                video.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                video.updateAttrs(mUSProps2);
            }
            return video;
        }
    }
}
