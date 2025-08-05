package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.v4.view.ActionProvider;
import android.support.v7.widget.ActivityChooserModel;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.taobao.taobao.R;
import tb.ace;

/* loaded from: classes2.dex */
public class ShareActionProvider extends ActionProvider {
    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    final Context mContext;
    private int mMaxShownActivityCount;
    private ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final b mOnMenuItemClickListener;
    OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    String mShareHistoryFileName;

    /* loaded from: classes2.dex */
    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a implements ActivityChooserModel.OnChooseActivityListener {
        a() {
        }

        @Override // android.support.v7.widget.ActivityChooserModel.OnChooseActivityListener
        public boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent) {
            if (ShareActionProvider.this.mOnShareTargetSelectedListener != null) {
                ShareActionProvider.this.mOnShareTargetSelectedListener.onShareTargetSelected(ShareActionProvider.this, intent);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    private class b implements MenuItem.OnMenuItemClickListener {
        b() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent b = ActivityChooserModel.a(ShareActionProvider.this.mContext, ShareActionProvider.this.mShareHistoryFileName).b(menuItem.getItemId());
            if (b != null) {
                String action = b.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    ShareActionProvider.this.updateIntent(b);
                }
                ShareActionProvider.this.mContext.startActivity(b);
                return true;
            }
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.mMaxShownActivityCount = 4;
        this.mOnMenuItemClickListener = new b();
        this.mShareHistoryFileName = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.mContext = context;
    }

    private void setActivityChooserPolicyIfNeeded() {
        if (this.mOnShareTargetSelectedListener == null) {
            return;
        }
        if (this.mOnChooseActivityListener == null) {
            this.mOnChooseActivityListener = new a();
        }
        ActivityChooserModel.a(this.mContext, this.mShareHistoryFileName).a(this.mOnChooseActivityListener);
    }

    @Override // android.support.v4.view.ActionProvider
    public boolean hasSubMenu() {
        return true;
    }

    @Override // android.support.v4.view.ActionProvider
    public View onCreateActionView() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.mContext);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.a(this.mContext, this.mShareHistoryFileName));
        }
        TypedValue typedValue = new TypedValue();
        this.mContext.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(ace.b(this.mContext, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // android.support.v4.view.ActionProvider
    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        ActivityChooserModel a2 = ActivityChooserModel.a(this.mContext, this.mShareHistoryFileName);
        PackageManager packageManager = this.mContext.getPackageManager();
        int a3 = a2.a();
        int min = Math.min(a3, this.mMaxShownActivityCount);
        for (int i = 0; i < min; i++) {
            ResolveInfo a4 = a2.a(i);
            subMenu.add(0, i, i, a4.loadLabel(packageManager)).setIcon(a4.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
        }
        if (min < a3) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.mContext.getString(R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < a3; i2++) {
                ResolveInfo a5 = a2.a(i2);
                addSubMenu.add(0, i2, i2, a5.loadLabel(packageManager)).setIcon(a5.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
            }
        }
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onShareTargetSelectedListener) {
        this.mOnShareTargetSelectedListener = onShareTargetSelectedListener;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareHistoryFileName(String str) {
        this.mShareHistoryFileName = str;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                updateIntent(intent);
            }
        }
        ActivityChooserModel.a(this.mContext, this.mShareHistoryFileName).a(intent);
    }

    void updateIntent(Intent intent) {
        intent.addFlags(Build.VERSION.SDK_INT >= 21 ? 134742016 : 524288);
    }
}
