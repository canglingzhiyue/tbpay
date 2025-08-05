package com.taobao.login4android.membercenter.account.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LoadImageTask;
import com.ali.user.mobile.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class NewAccountAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isDeleteMode = false;
    private OnButtonClickListener mConfirmClickListener;
    private Context mContext;
    private OnButtonClickListener mDeleteClickListener;
    private List<SessionModel> mListAccounts;
    private ListView mListView;
    private boolean mLoginMode;

    /* loaded from: classes7.dex */
    public interface OnButtonClickListener {
        void click(View view, int i);
    }

    /* loaded from: classes7.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f17904a;
        public TextView b;
        public TextView c;
        public Button d;
        public Button f;
        public TextView g;
        public View h;

        static {
            kge.a(-1077738761);
        }

        public a(View view) {
            this.f17904a = (ImageView) view.findViewById(R.id.aliuser_account_item_avatar);
            this.b = (TextView) view.findViewById(R.id.aliuser_account_item_userinput);
            this.c = (TextView) view.findViewById(R.id.aliuser_account_item_selected);
            this.d = (Button) view.findViewById(R.id.aliuser_account_item_delete_btn);
            this.f = (Button) view.findViewById(R.id.aliuser_account_item_confirm_btn);
            this.g = (TextView) view.findViewById(R.id.aliuser_account_item_current);
            this.h = view.findViewById(R.id.aliuser_click_ll);
        }
    }

    static {
        kge.a(1408298558);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public static /* synthetic */ OnButtonClickListener access$000(NewAccountAdapter newAccountAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnButtonClickListener) ipChange.ipc$dispatch("eda65598", new Object[]{newAccountAdapter}) : newAccountAdapter.mDeleteClickListener;
    }

    public static /* synthetic */ OnButtonClickListener access$100(NewAccountAdapter newAccountAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnButtonClickListener) ipChange.ipc$dispatch("d4e4f337", new Object[]{newAccountAdapter}) : newAccountAdapter.mConfirmClickListener;
    }

    public NewAccountAdapter(Context context, ListView listView, List<SessionModel> list, boolean z) {
        this.mLoginMode = false;
        this.mContext = context;
        this.mListView = listView;
        this.mListAccounts = new ArrayList(list);
        this.mLoginMode = z;
        ImageUtil.emptyMemoryCache();
        LoadImageTask.rmImagePath(context, "ListHeadImages");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<SessionModel> list = this.mListAccounts;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void setConfirmClickListener(OnButtonClickListener onButtonClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28b120d7", new Object[]{this, onButtonClickListener});
        } else {
            this.mConfirmClickListener = onButtonClickListener;
        }
    }

    public void setOnDeleteClickListener(OnButtonClickListener onButtonClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef267c5", new Object[]{this, onButtonClickListener});
        } else {
            this.mDeleteClickListener = onButtonClickListener;
        }
    }

    public void setDeleteMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce82493d", new Object[]{this, new Boolean(z)});
        } else {
            this.isDeleteMode = z;
        }
    }

    public boolean isDeleteMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74acb43", new Object[]{this})).booleanValue() : this.isDeleteMode;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        List<SessionModel> list = this.mListAccounts;
        if (list != null && i >= 0 && i < list.size()) {
            return this.mListAccounts.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public View getView(final int i, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view2 = LayoutInflater.from(this.mContext).inflate(R.layout.aliuser_multiaccount_list_item_layout, (ViewGroup) null);
            aVar = new a(view2);
            view2.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
            view2 = view;
        }
        try {
            SessionModel sessionModel = this.mListAccounts.get(i);
            aVar.b.setText(StringUtil.dataMasking(getAccount(sessionModel), true));
            if (!TextUtils.isEmpty(sessionModel.headPicLink)) {
                aVar.f17904a.setTag(sessionModel.headPicLink);
                new LoadImageTask(DataProviderFactory.getApplicationContext(), this.mListView, "ListHeadImages", 160, true, this.mLoginMode).execute(sessionModel.headPicLink);
            } else {
                aVar.f17904a.setImageResource(R.drawable.aliuser_placeholder);
            }
            if (this.mLoginMode) {
                if (i == 0) {
                    aVar.c.setText(R.string.aliuser_multi_account_last_user);
                    aVar.c.setVisibility(0);
                } else {
                    aVar.c.setVisibility(8);
                }
                aVar.f.setText(R.string.aliuser_login_title);
            } else {
                aVar.c.setVisibility(8);
                aVar.f.setText(R.string.aliuser_change_title);
                if (AccountHelper.isCurrentLoginUser(sessionModel)) {
                    aVar.g.setText(R.string.aliuser_multi_account_current_user);
                    aVar.g.setVisibility(0);
                    aVar.f.setVisibility(4);
                } else {
                    aVar.g.setVisibility(8);
                    aVar.f.setVisibility(0);
                }
            }
            if (this.isDeleteMode) {
                aVar.d.setVisibility(0);
                aVar.f.setVisibility(4);
                aVar.g.setVisibility(8);
                if (this.mDeleteClickListener != null) {
                    aVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.adapter.NewAccountAdapter.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                            } else {
                                NewAccountAdapter.access$000(NewAccountAdapter.this).click(view3, i);
                            }
                        }
                    });
                }
            } else {
                aVar.d.setVisibility(8);
                if (this.mConfirmClickListener != null) {
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.taobao.login4android.membercenter.account.adapter.NewAccountAdapter.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view3});
                            } else {
                                NewAccountAdapter.access$100(NewAccountAdapter.this).click(view3, i);
                            }
                        }
                    };
                    aVar.f.setOnClickListener(onClickListener);
                    aVar.h.setOnClickListener(onClickListener);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return view2;
    }

    public String getAccount(SessionModel sessionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79fe8144", new Object[]{this, sessionModel});
        }
        String str = sessionModel.showLoginId;
        return TextUtils.isEmpty(str) ? sessionModel.nick : str;
    }
}
