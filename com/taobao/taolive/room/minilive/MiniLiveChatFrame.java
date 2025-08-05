package com.taobao.taolive.room.minilive;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import tb.kge;

/* loaded from: classes8.dex */
public class MiniLiveChatFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mChatController;

    static {
        kge.a(-1313362298);
    }

    public static /* synthetic */ Object ipc$super(MiniLiveChatFrame miniLiveChatFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.hide();
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else if (hashCode != 588897590) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onVideoStatusChanged(((Number) objArr[0]).intValue());
            return null;
        }
    }

    public MiniLiveChatFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mChatController = new b(this.mContext, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            this.mContainer = this.mChatController.a(viewStub);
        }
    }

    public void onCreateView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            return;
        }
        this.mContainer = view;
        this.mChatController.a(view);
    }

    public void destroyPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ed0955", new Object[]{this});
            return;
        }
        b bVar = this.mChatController;
        if (bVar == null) {
            return;
        }
        bVar.d();
    }

    public void recoverPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87fc182b", new Object[]{this});
            return;
        }
        b bVar = this.mChatController;
        if (bVar == null) {
            return;
        }
        bVar.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        b bVar = this.mChatController;
        if (bVar == null) {
            return;
        }
        bVar.f();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        b bVar = this.mChatController;
        if (bVar == null) {
            return;
        }
        bVar.g();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onVideoStatusChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2319dd36", new Object[]{this, new Integer(i)});
        } else {
            super.onVideoStatusChanged(i);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        b bVar = this.mChatController;
        if (bVar == null) {
            return;
        }
        bVar.h();
    }
}
