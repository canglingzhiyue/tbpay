package com.taobao.taolive.room.ui.input.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.c;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import tb.kge;
import tb.phg;
import tb.plx;
import tb.xkw;

/* loaded from: classes8.dex */
public class SyncQuestionLayout extends LinearLayout implements View.OnClickListener, d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SOURCE_COMMENT = "comment";
    private static final String TAG = "SyncQuestionLayout";
    private com.taobao.alilive.aliliveframework.frame.a mFrameContext;
    private boolean mIsChecked;
    private boolean mIsShow;
    private RadioButton mRadioButton;
    private TBLiveDataModel mTbLiveDataModel;
    private IUniversalProxy.a qaPublishBusiness;

    static {
        kge.a(-1809626603);
        kge.a(-1201612728);
        kge.a(-797454141);
    }

    public static /* synthetic */ Object ipc$super(SyncQuestionLayout syncQuestionLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        }
    }

    public static /* synthetic */ void access$000(SyncQuestionLayout syncQuestionLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8e5e71", new Object[]{syncQuestionLayout});
        } else {
            syncQuestionLayout.initQAPublishBusiness();
        }
    }

    public SyncQuestionLayout(Context context) {
        this(context, null);
    }

    public SyncQuestionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SyncQuestionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsChecked = false;
        if (c.a().d()) {
            initQAPublishBusiness();
        } else {
            c.a().a(new c.b() { // from class: com.taobao.taolive.room.ui.input.view.SyncQuestionLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.proxy.c.b
                public void a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        SyncQuestionLayout.access$000(SyncQuestionLayout.this);
                    }
                }
            });
        }
        LayoutInflater.from(context).inflate(R.layout.taolive_sync_question_layout, this);
        initView();
    }

    private void initQAPublishBusiness() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eede7fb6", new Object[]{this});
        } else if (f.o() == null) {
        } else {
            this.qaPublishBusiness = f.o().createQAPublishBusiness(this);
        }
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mRadioButton = (RadioButton) findViewById(R.id.input_sync_qa);
        this.mRadioButton.setOnClickListener(this);
        findViewById(R.id.input_qa_entrance).setOnClickListener(this);
    }

    public void setFrameContext(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17230f1a", new Object[]{this, aVar});
        } else {
            this.mFrameContext = aVar;
        }
    }

    public void setTBLiveDataModel(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9513b1a3", new Object[]{this, tBLiveDataModel});
        } else {
            this.mTbLiveDataModel = tBLiveDataModel;
        }
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (this.mIsShow) {
        } else {
            this.mIsShow = true;
            if (getVisibility() != 0) {
                return;
            }
            phg.a().a(this.mFrameContext, "Show-CommentQuiz", new HashMap<>());
            phg.a().a(this.mFrameContext, "Show-InviteAnswer", new HashMap<>());
        }
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.mIsShow = false;
        this.mIsChecked = false;
        this.mRadioButton.setChecked(false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.taobao.alilive.aliliveframework.frame.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.input_sync_qa) {
            if (this.mIsChecked) {
                this.mRadioButton.setChecked(false);
            } else {
                this.mRadioButton.setChecked(true);
                phg.a().a(this.mFrameContext, "InviteAnswer", new String[0]);
            }
            this.mIsChecked = !this.mIsChecked;
        } else if (view.getId() != R.id.input_qa_entrance) {
        } else {
            String c = a.c(this.mTbLiveDataModel);
            if (!TextUtils.isEmpty(c) && (aVar = this.mFrameContext) != null) {
                aVar.e().a(xkw.EVENT_SHOW_QA, c, this.mFrameContext.G());
            }
            com.taobao.alilive.aliliveframework.frame.a aVar2 = this.mFrameContext;
            this.mFrameContext.e().a(xkw.EVENT_INPUT_HIDE, null, aVar2 != null ? aVar2.G() : null);
            phg.a().a(this.mFrameContext, "CommentQuiz", new String[0]);
        }
    }

    public boolean isChecked() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f77ac528", new Object[]{this})).booleanValue() : this.mIsChecked;
    }

    public void publish(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b81260", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || !this.mIsChecked) {
        } else {
            String str2 = null;
            TBLiveDataModel tBLiveDataModel = this.mTbLiveDataModel;
            if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
                str2 = this.mTbLiveDataModel.mVideoInfo.liveId;
            }
            IUniversalProxy.a aVar = this.qaPublishBusiness;
            if (aVar == null) {
                return;
            }
            aVar.a(str, str2, "comment");
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        plx.b(TAG, netResponse.getApi() + " errorCode = " + netResponse.getRetCode() + "  errorMsg = " + netResponse.getRetMsg());
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }
}
