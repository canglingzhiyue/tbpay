package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.quickcomment.bean.QuickCommReport;
import com.taobao.android.live.plugin.proxy.comments.CommentsProxy;
import com.taobao.aranger.constant.Constants;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.j;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.cgl;
import tb.ddv;
import tb.ddw;
import tb.ffg;
import tb.hfr;
import tb.hfs;
import tb.hfv;
import tb.hix;
import tb.hkk;
import tb.jzn;
import tb.kge;
import tb.phg;
import tb.phl;
import tb.phq;
import tb.plh;
import tb.pli;
import tb.ply;
import tb.pmd;
import tb.tfu;
import tb.xkw;

/* loaded from: classes6.dex */
public class InputFrame3 extends AbsInputFrame2 implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK_TYPE = "callbackType";
    public static final String INPUT_HINT = "inputhint";
    public static final String INPUT_LIMIT_CNT = "limitcnt";
    public static final String INPUT_LIMIT_TOAST = "limitcnt_toast";
    public static final String INPUT_TYPE = "inputtype";
    public static final String REPLIED_COMMENT_ID = "replied_comment_id";
    public static final String REPLIED_COMMENT_NICK = "replied_comment_nick";
    private static final String TAG = "InputFrame3";
    public static final String TYPE_LIVE_LINK = "linklive";
    public static final String TYPE_RESPONSE = "response";
    public String mAnchorId;
    private Handler mHandler;
    private com.taobao.taolive.sdk.business.g mInteractBusiness;
    private plh mSendMessageListener;
    public String mTopic;
    private boolean showLimitToast;

    static {
        kge.a(689601215);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(InputFrame3 inputFrame3, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            case 828074091:
                super.showKeyBoard();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : TAG;
    }

    public static /* synthetic */ void access$000(InputFrame3 inputFrame3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12073895", new Object[]{inputFrame3, str});
        } else {
            inputFrame3.setTextString(str);
        }
    }

    public static /* synthetic */ boolean access$100(InputFrame3 inputFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4088b4ae", new Object[]{inputFrame3})).booleanValue() : inputFrame3.showLimitToast;
    }

    public InputFrame3(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mHandler = new Handler();
        this.showLimitToast = false;
    }

    public void setSendMessageListener(plh plhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f397827c", new Object[]{this, plhVar});
        } else {
            this.mSendMessageListener = plhVar;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        com.taobao.taolive.room.ui.fanslevel.a.a().e();
        this.mFrameContext.e().a(this);
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo == null) {
            return;
        }
        this.mTopic = videoInfo.topic;
        if (videoInfo.broadCaster == null) {
            return;
        }
        this.mAnchorId = videoInfo.broadCaster.accountId;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        handleAutoInputText();
    }

    private void handleAutoInputText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eddea67", new Object[]{this});
            return;
        }
        Map<String, String> g = this.mFrameContext.g();
        if (g == null || g.isEmpty() || !g.containsKey("autoInputText")) {
            return;
        }
        final String str = g.get("autoInputText");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                InputFrame3.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                InputFrame3.this.showKeyBoard();
                InputFrame3.access$000(InputFrame3.this, str);
            }
        }, 200L);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2
    public void onEditTextSend(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf5660f", new Object[]{this, str});
        } else if (!pmd.a().q().c()) {
            pmd.a().q().a((Activity) this.mContext, null);
        } else if (ply.C()) {
            com.taobao.taolive.room.utils.d.a(this.mContext.getApplicationContext(), this.mContext.getString(R.string.taolive_disable_publish_comment_flexalocal), 17);
        } else if (!checkInputContent(str)) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.mLastSendTime > 0 && currentTimeMillis - this.mLastSendTime < 3000) {
                com.taobao.taolive.room.utils.d.a(this.mContext, this.mContext.getString(R.string.taolive_eleven_chat_too_fast_flexalocal), 17);
                return;
            }
            StickerConfig checkOldExpression = checkOldExpression(str);
            HashMap hashMap = new HashMap();
            if (checkOldExpression != null) {
                hashMap.put("commentType", "anchor_custom_sticker");
                hashMap.put("stickerId", checkOldExpression.id);
                hashMap.put("stickerVersion", "2");
            }
            if (TextUtils.equals(this.mInputType, TYPE_LIVE_LINK)) {
                this.mFrameContext.e().a(xkw.EVENT_START_LINKLIVE_BY_MTOP_MSG, str, observeUniqueIdentification());
            } else {
                sendText4Comment(str, hashMap);
            }
            this.mEditText.setText("");
            hideContentViewInner();
            hideKeyBoard();
            resetInputStatus();
            this.mLastSendTime = currentTimeMillis;
            this.mFrameContext.e().a(xkw.EVENT_EDIT_TEXT_SEND, null, observeUniqueIdentification());
            phg.e();
        }
    }

    private StickerConfig checkOldExpression(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StickerConfig) ipChange.ipc$dispatch("9128b122", new Object[]{this, str});
        }
        String str2 = "";
        int i = -1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ('[' == charAt) {
                i = i2;
            } else if (']' == charAt && i >= 0) {
                String substring = str.substring(i, i2 + 1);
                if (this.mFrameContext != null && (this.mFrameContext.I() instanceof ffg) && ((ffg) this.mFrameContext.I()).e().containsKey(substring)) {
                    str2 = substring;
                }
                i = -1;
            }
        }
        if (!TextUtils.isEmpty(str2) && this.mFrameContext != null && (this.mFrameContext.I() instanceof ffg)) {
            return ((ffg) this.mFrameContext.I()).e().get(str2);
        }
        return null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (this.mEditText != null) {
            this.mEditText.setText((CharSequence) null);
        }
        this.mFrameContext.e().b(this);
        com.taobao.taolive.sdk.business.g gVar = this.mInteractBusiness;
        if (gVar != null) {
            gVar.a();
            this.mInteractBusiness = null;
        }
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        initOnRequired();
        if (xkw.EVENT_INPUT_SHOW.equals(str)) {
            if (ply.m() && j.a(this.mLiveDataModel)) {
                hix.a(this.mContext, "主播已关闭评论功能");
                phg.a().a(this.mFrameContext, 19999, "commentDisabled", (Map<String, String>) null);
                return;
            }
            if (this.mEditText != null) {
                this.mEditText.setHint(ply.at());
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String str2 = (String) map.get("content");
                if (!TextUtils.isEmpty(str2)) {
                    setTextString(str2);
                } else {
                    setTextString("");
                }
                String str3 = (String) map.get(INPUT_HINT);
                if (!TextUtils.isEmpty(str3)) {
                    this.mEditText.setHint(str3);
                }
                String str4 = (String) map.get(INPUT_LIMIT_CNT);
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        this.mLimitCnt = Integer.parseInt(str4);
                    } catch (Exception unused) {
                    }
                }
                String str5 = (String) map.get(INPUT_LIMIT_TOAST);
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        this.showLimitToast = Boolean.parseBoolean(str5);
                    } catch (Exception unused2) {
                    }
                }
                String str6 = (String) map.get(INPUT_TYPE);
                if (!TextUtils.isEmpty(str6)) {
                    this.mInputType = str6;
                }
                this.mRepliedCommentId = (String) map.get(REPLIED_COMMENT_ID);
                this.mRepliedCommentNick = (String) map.get(REPLIED_COMMENT_NICK);
                if (!TextUtils.isEmpty(this.mRepliedCommentId) && !TextUtils.isEmpty(this.mRepliedCommentNick)) {
                    String str7 = "@" + this.mRepliedCommentNick + " ";
                    this.mEditText.setText(str7);
                    this.mEditText.setSelection(str7.length());
                    this.mUnEnableDeleteLimit = str7.length();
                    if (!TextUtils.equals(this.mCommentType, hfs.COMMENT_TYPE_CONVENIENT)) {
                        this.mCommentType = Constants.PARAM_REPLY;
                    }
                } else if (!TextUtils.equals(this.mCommentType, hfs.COMMENT_TYPE_CONVENIENT)) {
                    this.mCommentType = "normal";
                }
                String str8 = (String) map.get("enableQuickComment");
                String str9 = (String) map.get(hfr.REPORT_QUICK_COMMENT);
                if (this.inputQuickCommentController != null) {
                    this.inputQuickCommentController.b(str9);
                    this.inputQuickCommentController.a(str8);
                }
                this.mCallbackType = (String) map.get(CALLBACK_TYPE);
            } else {
                this.mCallbackType = null;
                this.mCommentType = "normal";
            }
            this.mEditText.setFilters(new InputFilter[]{new pli(this.mLimitCnt)});
            this.mEditText.addTextChangedListener(new TextWatcher() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    }
                }

                {
                    InputFrame3.this = this;
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                    } else if (!InputFrame3.access$100(InputFrame3.this) || TextUtils.isEmpty(InputFrame3.this.mEditText.getText()) || InputFrame3.this.mEditText.getText().length() < InputFrame3.this.mLimitCnt) {
                    } else {
                        Context applicationContext = InputFrame3.this.mContext.getApplicationContext();
                        Context applicationContext2 = InputFrame3.this.mContext.getApplicationContext();
                        int i = R.string.taolive_chat_too_long_flexalocal;
                        com.taobao.taolive.room.utils.d.a(applicationContext, applicationContext2.getString(i, InputFrame3.this.mLimitCnt + ""));
                    }
                }
            });
            this.mEditText.setOnKeyListener(new View.OnKeyListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.-$$Lambda$InputFrame3$i8TFW9_713wfm-q5EEmNgLbyRVQ
                {
                    InputFrame3.this = this;
                }

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return InputFrame3.this.lambda$onEvent$27$InputFrame3(view, i, keyEvent);
                }
            });
            showKeyBoard();
            refreshQuickExpression();
        } else if (xkw.EVENT_INPUT_HIDE.equals(str)) {
            hideContentViewInner();
            hideKeyBoard();
        } else if (!xkw.EVENT_SEND_COMMENT.equals(str) || !(obj instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            sendText4Comment(jSONObject.getString("content"), (Map) jSONObject.get("extendVal"));
        }
    }

    public /* synthetic */ boolean lambda$onEvent$27$InputFrame3(View view, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d45ce65d", new Object[]{this, view, new Integer(i), keyEvent})).booleanValue() : keyEvent.getKeyCode() == 67 && this.mEditText.getText().length() == this.mUnEnableDeleteLimit;
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_INPUT_SHOW, xkw.EVENT_INPUT_HIDE, xkw.EVENT_SEND_COMMENT};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }

    public boolean checkInputContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8097e1cc", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        com.taobao.taolive.room.utils.d.a(this.mContext, this.mContext.getString(R.string.taolive_chat_none_flexalocal), 17);
        return false;
    }

    public void sendText4Comment(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6382574", new Object[]{this, str, map});
            return;
        }
        plh plhVar = this.mSendMessageListener;
        if (plhVar != null) {
            plhVar.a(str);
            this.mSendMessageListener.a(map);
        }
        if ("H5".equals(this.mCallbackType)) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            WVStandardEventCenter.postNotificationToJS("TBLiveWVPlugin.Event.comment.input", JSON.toJSONString(hashMap));
        } else if (AbsInputFrame2.CALL_BACK_TYPE_WEEX.equals(this.mCallbackType)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("message", str);
            if (!(this.mFrameContext instanceof phq) || ((phq) this.mFrameContext).p() == null) {
                return;
            }
            ((phq) this.mFrameContext).p().a("TBLiveWeex.Event.comment.input", hashMap2);
        } else {
            if (ply.D()) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put(tfu.COMMENT, str);
                hashMap3.put("commentType", "input");
                if ((this.mFrameContext instanceof phq) && ((phq) this.mFrameContext).p() != null) {
                    ((phq) this.mFrameContext).p().a("TBLiveWVPlugin.Event.sendComment", hashMap3);
                }
            }
            if (this.mInteractBusiness == null) {
                this.mInteractBusiness = new com.taobao.taolive.sdk.business.g(this.mFrameContext.h());
            }
            this.mSyncQuestionLayout.publish(str);
            if (this.mLiveDataModel == null) {
                q.b(TAG, "mLiveDataModel = null sendText4Comment return");
                return;
            }
            VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
            if (videoInfo != null && videoInfo.publishCommentsUseMtop) {
                HashMap<String, String> genMessageV2BusinessRender = genMessageV2BusinessRender(map);
                if (phg.a() != null) {
                    if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(videoInfo)) {
                        this.mInteractBusiness.a(this.mAnchorId, this.mTopic, getOfficialLiveTopic(videoInfo), str, genMessageV2BusinessRender, this.mSendMessageListener, phg.a().a(this.mFrameContext));
                    } else {
                        this.mInteractBusiness.a(this.mAnchorId, this.mTopic, str, genMessageV2BusinessRender, this.mSendMessageListener, phg.a().a(this.mFrameContext));
                    }
                } else if (com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(videoInfo)) {
                    this.mInteractBusiness.a(this.mAnchorId, this.mTopic, getOfficialLiveTopic(videoInfo), str, genMessageV2BusinessRender, this.mSendMessageListener);
                } else {
                    this.mInteractBusiness.a(this.mAnchorId, this.mTopic, str, genMessageV2BusinessRender, this.mSendMessageListener);
                }
            } else {
                this.mInteractBusiness.a(this.mTopic, str);
                ChatMessage chatMessage = new ChatMessage();
                chatMessage.mContent = str;
                chatMessage.mUserNick = cgl.i().b();
                chatMessage.mUserId = v.c(cgl.i().a());
                chatMessage.mTimestamp = cgl.j().a();
                this.mFrameContext.e().a(xkw.EVENT_ADD_ITEM, chatMessage, observeUniqueIdentification());
            }
            if (TextUtils.equals(this.mCommentType, hfs.COMMENT_TYPE_CONVENIENT)) {
                this.mFrameContext.e().a(hfr.HIDE_QUICK_COMMENT_EVENT, null, observeUniqueIdentification());
            }
            phl a2 = phg.a();
            com.taobao.alilive.aliliveframework.frame.a aVar = this.mFrameContext;
            a2.b(aVar, tfu.COMMENT, "content=" + str);
            addUTTrack(str, map, "commentType=0");
            resetTypeState();
            if (!hkk.z()) {
                return;
            }
            try {
                showCommentKeywordAtmosphere(str);
            } catch (Throwable th) {
                q.b(TAG, "showCommentKeywordAtmosphere: show exception msg=" + th.getMessage());
            }
        }
    }

    private void showCommentKeywordAtmosphere(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6049b13a", new Object[]{this, str});
            return;
        }
        String str2 = null;
        HashMap<String, String> p = (this.mFrameContext == null || !(this.mFrameContext.I() instanceof ffg)) ? null : ((ffg) this.mFrameContext.I()).p();
        if (p == null || p.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, String>> it = p.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            if (TextUtils.equals(next.getKey(), str)) {
                str2 = next.getValue();
                break;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str2);
        jSONObject.put("md5", (Object) str2);
        jSONArray.add(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("originData", (Object) jSONArray);
        ddw.a().a(xkw.EVENT_PREFETCH_GIFT_RESOURCE, JSONObject.toJSONString(jSONObject2));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("animationMp4", (Object) str2);
        jSONObject3.put("giftLevel", (Object) "999");
        jSONObject3.put("giftSourceType", (Object) "admire");
        jSONObject3.put("giftType", (Object) "1");
        final JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("giftEffectInfo", (Object) jSONObject3);
        this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.-$$Lambda$InputFrame3$WSr9dmY1kKia4VJPXJRHgXcuPvw
            @Override // java.lang.Runnable
            public final void run() {
                InputFrame3.lambda$showCommentKeywordAtmosphere$28(JSONObject.this);
            }
        }, 100L);
    }

    public static /* synthetic */ void lambda$showCommentKeywordAtmosphere$28(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338b6545", new Object[]{jSONObject});
            return;
        }
        q.b(TAG, "onDataReceived: show gift animation");
        ddw.a().a(xkw.EVENT_SEND_GIFT, JSONObject.toJSONString(jSONObject));
    }

    private HashMap<String, String> genMessageV2BusinessRender(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("376207d8", new Object[]{this, map});
        }
        HashMap<String, String> hashMap = new HashMap<>(com.taobao.taolive.room.ui.fanslevel.a.a().f());
        if (map != null) {
            hashMap.putAll(map);
        }
        if (this.mSyncQuestionLayout.isChecked()) {
            hashMap.put(aw.PARAM_CHAT_RENDERS_ENHANCE, ((CommentsProxy) com.taobao.android.live.plugin.proxy.f.e()).getEnhancedTypeQuestionAnswer());
        }
        if (!TextUtils.isEmpty(this.mRepliedCommentId)) {
            hashMap.put("userReply2UserCommentId", this.mRepliedCommentId);
        }
        if (!TextUtils.isEmpty(this.mCommentType)) {
            if (TextUtils.equals(this.mCommentType, Constants.PARAM_REPLY) || TextUtils.equals(this.mCommentType, hfs.COMMENT_TYPE_CONVENIENT)) {
                hashMap.put("comment_type", this.mCommentType);
            } else if (this.mEditText != null && !TextUtils.isEmpty(this.mEditText.getRecentlyPasteText()) && TextUtils.equals(this.mEditText.getRecentlyPasteText(), this.mEditText.getText().toString())) {
                hashMap.put("comment_type", "paste");
            } else {
                hashMap.put("comment_type", "normal");
            }
            if (map != null && hfv.KEY_ADD_ONE.equals(map.get("commentType"))) {
                hashMap.put("comment_type", hfv.KEY_ADD_ONE);
            }
            if (map != null && map.containsKey("comment_location")) {
                hashMap.put("comment_location", map.get("comment_location"));
            }
        }
        return hashMap;
    }

    private String getOfficialLiveTopic(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e95ff53c", new Object[]{this, videoInfo});
        }
        if (!com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().b(videoInfo)) {
            return null;
        }
        return videoInfo.officialLiveInfo.officialLiveTopic;
    }

    public void addUTTrack(String str, Map<String, String> map, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd944f6", new Object[]{this, str, map, strArr});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ArrayList arrayList = new ArrayList();
            if (strArr != null && strArr.length != 0) {
                arrayList.addAll(Arrays.asList(strArr));
            }
            arrayList.add("content=" + str);
            arrayList.add("word_after=" + str);
            arrayList.add("type=0");
            StringBuilder sb = new StringBuilder();
            sb.append("is_emoji=");
            String str2 = "1";
            sb.append(v.a(this.mContext, this.mFrameContext, str) ? str2 : "0");
            arrayList.add(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("is_vipemoji=");
            if (map == null || !"anchor_custom_sticker".equals(map.get("commentType"))) {
                str2 = "0";
            }
            sb2.append(str2);
            arrayList.add(sb2.toString());
            if (TextUtils.equals(this.mCommentType, Constants.PARAM_REPLY)) {
                arrayList.add("comment_type=" + this.mCommentType);
            } else if (TextUtils.equals(this.mCommentType, hfs.COMMENT_TYPE_CONVENIENT) && this.inputQuickCommentController != null) {
                QuickCommReport quickCommentReport = getQuickCommentReport();
                if (quickCommentReport != null) {
                    arrayList.add(ag.ARG_ITEM_ID + quickCommentReport.itemId);
                    arrayList.add("content_guide=" + quickCommentReport.guideText);
                }
                arrayList.add("content_convenient=" + this.mQuickCommentBubbleText);
                arrayList.add("comment_type=" + this.mCommentType);
            } else if (map != null && hfv.KEY_ADD_ONE.equals(map.get("commentType"))) {
                arrayList.add("comment_type=addOne");
            } else if (this.mEditText != null && !TextUtils.isEmpty(this.mEditText.getRecentlyPasteText()) && TextUtils.equals(this.mEditText.getRecentlyPasteText(), this.mEditText.getText().toString())) {
                arrayList.add("comment_type=paste");
            } else {
                arrayList.add("comment_type=normal");
            }
            if (map != null && map.containsKey("comment_location")) {
                arrayList.add("comment_location=" + map.get("comment_location"));
            }
            phg.a().a(this.mFrameContext, ag.CLICK_COMMENT_SEND, (String[]) arrayList.toArray(new String[0]));
            jzn.a(this.mFrameContext, tfu.COMMENT, 0L);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2
    public void showKeyBoard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315b686b", new Object[]{this});
            return;
        }
        super.showKeyBoard();
        if (TextUtils.equals(this.mInputType, TYPE_LIVE_LINK)) {
            return;
        }
        HashMap hashMap = new HashMap();
        QuickCommReport quickCommentReport = getQuickCommentReport();
        if (quickCommentReport != null) {
            hashMap.put("item_id", quickCommentReport.itemId);
            hashMap.put("content_guide", quickCommentReport.guideText);
        }
        phg.a().a(this.mFrameContext, ag.OPEN_COMMENT, new String[0]);
        phg.a().b(this.mFrameContext, "openComment", new String[0]);
    }

    private QuickCommReport getQuickCommentReport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QuickCommReport) ipChange.ipc$dispatch("72f0721", new Object[]{this});
        }
        if (this.inputQuickCommentController != null) {
            return this.inputQuickCommentController.a();
        }
        return null;
    }

    private void setTextString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600a8431", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mEditText.setText(str);
            this.mEditText.setSelection(str.length());
        }
    }

    private void resetTypeState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29b156f", new Object[]{this});
        } else {
            this.mCommentType = "normal";
        }
    }
}
