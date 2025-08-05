package com.taobao.android.live.plugin.atype.flexalocal.comments.topinfo;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.a;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.hkk;
import tb.kge;
import tb.phg;
import tb.ply;
import tb.pqj;

/* loaded from: classes5.dex */
public class TopSelectCommentFrame extends BaseFrame implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_TYPE_TOP_ANCHOR_RESPONSE = "topAnchorResponse";
    private static final String BIZ_TYPE_TOP_SELECT_COMMENT = "topSelectComment";
    private static final int MSG_WHAT_HIDE = 0;
    private static final int MSG_WHAT_RESUME_MESSAGE = 1;
    private static final int MSG_WHAT_SHOW_OTHER_VIEW = 2;
    private static final String TAG = "TopSelectCommentFrame";
    private long mCommentSelectShowTime;
    private List<TopSelectCommentData> mDataList;
    private Handler mMainHandler;
    private d.a mMessageListener;

    static {
        kge.a(-1360193852);
        kge.a(-1905361424);
    }

    public static /* synthetic */ Object ipc$super(TopSelectCommentFrame topSelectCommentFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-top-select_comment";
    }

    public static /* synthetic */ void access$000(TopSelectCommentFrame topSelectCommentFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6d984e", new Object[]{topSelectCommentFrame, jSONObject});
        } else {
            topSelectCommentFrame.addMessageToList(jSONObject);
        }
    }

    public static /* synthetic */ void access$100(TopSelectCommentFrame topSelectCommentFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1bac723", new Object[]{topSelectCommentFrame});
        } else {
            topSelectCommentFrame.startResumeMessage();
        }
    }

    public static /* synthetic */ Handler access$200(TopSelectCommentFrame topSelectCommentFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("894704e2", new Object[]{topSelectCommentFrame}) : topSelectCommentFrame.mMainHandler;
    }

    public TopSelectCommentFrame(Context context) {
        super(context);
        this.mDataList = new ArrayList();
        this.mCommentSelectShowTime = 15000L;
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.topinfo.TopSelectCommentFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (i != 10084 || !(obj instanceof String)) {
                } else {
                    if (hkk.O()) {
                        q.b(TopSelectCommentFrame.TAG, "881000244 message type: MSG_TYPE_CHAT_COMMENT_COMMON, msg data: " + obj.toString());
                    }
                    final JSONObject b = pqj.b((String) obj);
                    String string = b.getString("bizType");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    if (!TextUtils.equals(string, TopSelectCommentFrame.BIZ_TYPE_TOP_SELECT_COMMENT) && !TextUtils.equals(string, TopSelectCommentFrame.BIZ_TYPE_TOP_ANCHOR_RESPONSE)) {
                        return;
                    }
                    TopSelectCommentFrame.access$200(TopSelectCommentFrame.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.topinfo.TopSelectCommentFrame.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            TopSelectCommentFrame.access$000(TopSelectCommentFrame.this, b);
                            TopSelectCommentFrame.access$100(TopSelectCommentFrame.this);
                        }
                    });
                }
            }
        };
        init();
    }

    public TopSelectCommentFrame(Context context, boolean z) {
        super(context, z);
        this.mDataList = new ArrayList();
        this.mCommentSelectShowTime = 15000L;
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.topinfo.TopSelectCommentFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (i != 10084 || !(obj instanceof String)) {
                } else {
                    if (hkk.O()) {
                        q.b(TopSelectCommentFrame.TAG, "881000244 message type: MSG_TYPE_CHAT_COMMENT_COMMON, msg data: " + obj.toString());
                    }
                    final JSONObject b = pqj.b((String) obj);
                    String string = b.getString("bizType");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    if (!TextUtils.equals(string, TopSelectCommentFrame.BIZ_TYPE_TOP_SELECT_COMMENT) && !TextUtils.equals(string, TopSelectCommentFrame.BIZ_TYPE_TOP_ANCHOR_RESPONSE)) {
                        return;
                    }
                    TopSelectCommentFrame.access$200(TopSelectCommentFrame.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.topinfo.TopSelectCommentFrame.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            TopSelectCommentFrame.access$000(TopSelectCommentFrame.this, b);
                            TopSelectCommentFrame.access$100(TopSelectCommentFrame.this);
                        }
                    });
                }
            }
        };
        init();
    }

    public TopSelectCommentFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mDataList = new ArrayList();
        this.mCommentSelectShowTime = 15000L;
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.topinfo.TopSelectCommentFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (i != 10084 || !(obj instanceof String)) {
                } else {
                    if (hkk.O()) {
                        q.b(TopSelectCommentFrame.TAG, "881000244 message type: MSG_TYPE_CHAT_COMMENT_COMMON, msg data: " + obj.toString());
                    }
                    final JSONObject b = pqj.b((String) obj);
                    String string = b.getString("bizType");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    if (!TextUtils.equals(string, TopSelectCommentFrame.BIZ_TYPE_TOP_SELECT_COMMENT) && !TextUtils.equals(string, TopSelectCommentFrame.BIZ_TYPE_TOP_ANCHOR_RESPONSE)) {
                        return;
                    }
                    TopSelectCommentFrame.access$200(TopSelectCommentFrame.this).post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.topinfo.TopSelectCommentFrame.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            TopSelectCommentFrame.access$000(TopSelectCommentFrame.this, b);
                            TopSelectCommentFrame.access$100(TopSelectCommentFrame.this);
                        }
                    });
                }
            }
        };
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.mCommentSelectShowTime = ply.aE() * 1000;
        }
    }

    private void startResumeMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2bea65f", new Object[]{this});
        } else if (this.mDataList.size() == 0) {
        } else {
            TopSelectCommentData topSelectCommentData = this.mDataList.get(0);
            if (topSelectCommentData == null) {
                this.mDataList.remove(0);
                startResumeMessage();
                return;
            }
            DXRootView createDX = f.m().createDX(this.mContainer.getContext(), topSelectCommentData.templateName);
            if (createDX != null && (this.mContainer instanceof ViewGroup)) {
                ((ViewGroup) this.mContainer).removeAllViews();
                ((ViewGroup) this.mContainer).addView(createDX);
                f.m().renderDX(createDX, topSelectCommentData.data);
            }
            processShowAnim();
            this.mContainer.setVisibility(0);
            this.mDataList.remove(0);
            this.mMainHandler.sendEmptyMessageDelayed(0, this.mCommentSelectShowTime);
            showTrackParams(topSelectCommentData);
        }
    }

    private void showTrackParams(TopSelectCommentData topSelectCommentData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("917c253", new Object[]{this, topSelectCommentData});
        } else if (phg.a() == null) {
        } else {
            if (TextUtils.equals(topSelectCommentData.bizType, BIZ_TYPE_TOP_SELECT_COMMENT)) {
                phg.a().a(this.mFrameContext, "Show-topcomment", new HashMap<>());
            } else if (!TextUtils.equals(topSelectCommentData.bizType, BIZ_TYPE_TOP_ANCHOR_RESPONSE)) {
            } else {
                phg.a().a(this.mFrameContext, "Show-topcommentreply", new HashMap<>());
            }
        }
    }

    private void processShowAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f250c44", new Object[]{this});
            return;
        }
        hideOtherView();
        ObjectAnimator.ofFloat(this.mContainer, "alpha", 0.0f, 1.0f).setDuration(200L).start();
    }

    private void addMessageToList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcee92a", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("bizType");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        String string2 = jSONObject.getString("showType");
        String string3 = jSONObject.getString("templateName");
        TopSelectCommentData topSelectCommentData = new TopSelectCommentData();
        topSelectCommentData.bizType = string;
        topSelectCommentData.data = jSONObject2;
        topSelectCommentData.showType = string2;
        topSelectCommentData.templateName = string3;
        this.mDataList.add(topSelectCommentData);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
        } else {
            super.onViewCreated(view);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_top_select_comment_container_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mMainHandler = new com.taobao.taolive.sdk.model.f(this);
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.topinfo.TopSelectCommentFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 10084;
            }
        });
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
        this.mDataList.clear();
        showOtherView();
        if (this.mContainer == null) {
            return;
        }
        this.mContainer.setVisibility(8);
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                startResumeMessage();
            } else if (i != 2) {
            } else {
                showOtherView();
            }
        } else if (this.mDataList.size() > 0) {
            processHideAnim();
            this.mMainHandler.sendEmptyMessageDelayed(1, 300L);
        } else {
            processHideAnim();
            this.mMainHandler.sendEmptyMessageDelayed(2, 300L);
        }
    }

    private void processHideAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36ff989", new Object[]{this});
        } else {
            ObjectAnimator.ofFloat(this.mContainer, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    private void showOtherView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a258fdf", new Object[]{this});
        } else if ((getFrameContext() != null && this.mFrameContext.c) || getFrameContext() == null || getFrameContext().l() == null) {
        } else {
            getFrameContext().l().setVisibility(0);
        }
    }

    private void hideOtherView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c66525ba", new Object[]{this});
        } else if (getFrameContext() == null || getFrameContext().l() == null) {
        } else {
            getFrameContext().l().setVisibility(8);
        }
    }
}
