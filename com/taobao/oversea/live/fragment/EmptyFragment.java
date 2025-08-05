package com.taobao.oversea.live.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.TBErrorView;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes7.dex */
public class EmptyFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isLoading = true;
    private TBErrorView mErrorView;
    private a mRetryCallback;

    /* loaded from: classes7.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ Object ipc$super(EmptyFragment emptyFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode != -641568046) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ a access$000(EmptyFragment emptyFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b5daf142", new Object[]{emptyFragment}) : emptyFragment.mRetryCallback;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(createErrorView(getContext()));
        return frameLayout;
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        updateErrorViewStatus(true);
    }

    public void updateErrorViewStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce469dd7", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isLoading = z;
        TBErrorView tBErrorView = this.mErrorView;
        if (tBErrorView == null) {
            return;
        }
        if (z) {
            tBErrorView.setTitle("正在加载中");
            this.mErrorView.setSubTitle("请稍后...");
            this.mErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "加载中", new View.OnClickListener() { // from class: com.taobao.oversea.live.fragment.EmptyFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }
            });
            this.mErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 4);
            return;
        }
        tBErrorView.setTitle(ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
        this.mErrorView.setSubTitle("别紧张，试试看刷新页面~");
        this.mErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新", new View.OnClickListener() { // from class: com.taobao.oversea.live.fragment.EmptyFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                EmptyFragment.this.updateErrorViewStatus(true);
                if (EmptyFragment.access$000(EmptyFragment.this) == null) {
                    return;
                }
                EmptyFragment.access$000(EmptyFragment.this).a();
            }
        });
        this.mErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
    }

    public void setRetryCallback(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25dd642a", new Object[]{this, aVar});
        } else {
            this.mRetryCallback = aVar;
        }
    }

    private TBErrorView createErrorView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("bd2ff8e9", new Object[]{this, context});
        }
        this.mErrorView = new TBErrorView(context);
        this.mErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        this.mErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return this.mErrorView;
    }
}
