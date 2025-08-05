package com.taobao.uikit.extend.component.unify.Dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.v4.content.res.ResourcesCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.TBButtonType;
import com.taobao.uikit.extend.utils.ResourceUtils;
import com.taobao.uikit.extend.utils.RippleHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class TBMaterialDialog extends TBDialogBase implements View.OnClickListener, AdapterView.OnItemClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageView closeButton;
    public TextView content;
    public FrameLayout customViewFrame;
    public ImageView icon;
    public ListType listType;
    public ListView listView;
    public final Builder mBuilder;
    private final Handler mHandler;
    public TBDialogButton negativeButton;
    public TBDialogButton neutralButton;
    public TBDialogButton positiveButton;
    public List<Integer> selectedIndicesList;
    public TextView title;
    public View titleFrame;

    /* renamed from: com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog$2  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction;
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType = new int[ListType.values().length];
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$unify$TBButtonType;

        static {
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType[ListType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType[ListType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType[ListType.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $SwitchMap$com$taobao$uikit$extend$component$unify$TBButtonType = new int[TBButtonType.values().length];
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$TBButtonType[TBButtonType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$TBButtonType[TBButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$TBButtonType[TBButtonType.ALERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$TBButtonType[TBButtonType.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction = new int[DialogAction.values().length];
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction[DialogAction.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction[DialogAction.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction[DialogAction.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction[DialogAction.CLOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class DialogException extends WindowManager.BadTokenException {
        static {
            kge.a(-349392108);
        }

        public DialogException(String str) {
            super(str);
        }
    }

    /* loaded from: classes9.dex */
    public interface ListCallback {
        void onSelection(TBMaterialDialog tBMaterialDialog, View view, int i, TBSimpleListItem tBSimpleListItem);
    }

    /* loaded from: classes9.dex */
    public interface ListCallbackMultiChoice {
        boolean onSelection(TBMaterialDialog tBMaterialDialog, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    /* loaded from: classes9.dex */
    public interface ListCallbackSingleChoice {
        boolean onSelection(TBMaterialDialog tBMaterialDialog, View view, int i, CharSequence charSequence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes9.dex */
    public enum ListType {
        REGULAR,
        SINGLE,
        MULTI;

        public static int getLayoutForType(ListType listType) {
            int i = AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType[listType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return R.layout.uik_md_listitem_singlechoice;
                }
                if (i != 3) {
                    throw new IllegalArgumentException("Not a valid list type");
                }
                return R.layout.uik_md_listitem_multichoice;
            }
            return R.layout.uik_md_listitem;
        }
    }

    /* loaded from: classes9.dex */
    public static class NotImplementedException extends Error {
        static {
            kge.a(-2039226611);
        }

        public NotImplementedException(String str) {
            super(str);
        }
    }

    /* loaded from: classes9.dex */
    public interface SingleButtonCallback {
        void onClick(TBMaterialDialog tBMaterialDialog, DialogAction dialogAction);
    }

    static {
        kge.a(1759143409);
        kge.a(-1201612728);
        kge.a(54921071);
    }

    public static /* synthetic */ Object ipc$super(TBMaterialDialog tBMaterialDialog, String str, Object... objArr) {
        if (str.hashCode() == -340027132) {
            super.show();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final Builder getBuilder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("2128a0d5", new Object[]{this}) : this.mBuilder;
    }

    public TBMaterialDialog(Builder builder) {
        super(builder.context, TBDialogInit.getTheme(builder));
        this.mHandler = new Handler();
        this.mBuilder = builder;
        this.view = (TBDialogRootLayout) LayoutInflater.from(builder.context).inflate(TBDialogInit.getInflateLayout(builder), (ViewGroup) null);
        TBDialogInit.init(this);
    }

    public final void checkIfListInitScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("893a5b67", new Object[]{this});
            return;
        }
        ListView listView = this.listView;
        if (listView == null) {
            return;
        }
        listView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int intValue;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                if (Build.VERSION.SDK_INT < 16) {
                    TBMaterialDialog.this.listView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    TBMaterialDialog.this.listView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                if (TBMaterialDialog.this.listType != ListType.SINGLE && TBMaterialDialog.this.listType != ListType.MULTI) {
                    return;
                }
                if (TBMaterialDialog.this.listType == ListType.SINGLE) {
                    if (TBMaterialDialog.this.mBuilder.selectedIndex < 0) {
                        return;
                    }
                    intValue = TBMaterialDialog.this.mBuilder.selectedIndex;
                } else if (TBMaterialDialog.this.selectedIndicesList == null || TBMaterialDialog.this.selectedIndicesList.size() == 0) {
                    return;
                } else {
                    Collections.sort(TBMaterialDialog.this.selectedIndicesList);
                    intValue = TBMaterialDialog.this.selectedIndicesList.get(0).intValue();
                }
                if (TBMaterialDialog.this.listView.getLastVisiblePosition() >= intValue) {
                    return;
                }
                final int lastVisiblePosition = intValue - ((TBMaterialDialog.this.listView.getLastVisiblePosition() - TBMaterialDialog.this.listView.getFirstVisiblePosition()) / 2);
                if (lastVisiblePosition < 0) {
                    lastVisiblePosition = 0;
                }
                TBMaterialDialog.this.listView.post(new Runnable() { // from class: com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        TBMaterialDialog.this.listView.requestFocus();
                        TBMaterialDialog.this.listView.setSelection(lastVisiblePosition);
                    }
                });
            }
        });
    }

    public final void invalidateList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd1e080", new Object[]{this});
        } else if (this.listView == null) {
        } else {
            if ((this.mBuilder.items == null || this.mBuilder.items.length == 0) && this.mBuilder.adapter == null) {
                return;
            }
            this.listView.setAdapter(this.mBuilder.adapter);
            if (this.listType == null && this.mBuilder.listCallbackCustom == null) {
                return;
            }
            this.listView.setOnItemClickListener(this);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
        } else if (this.mBuilder.listCallbackCustom != null) {
            this.mBuilder.listCallbackCustom.onSelection(this, view, i, this.mBuilder.items[i]);
        } else {
            ListType listType = this.listType;
            if (listType == null || listType == ListType.REGULAR) {
                if (this.mBuilder.autoDismiss) {
                    dismiss();
                }
                if (this.mBuilder.listCallback == null) {
                    return;
                }
                this.mBuilder.listCallback.onSelection(this, view, i, this.mBuilder.items[i]);
            } else if (this.listType == ListType.MULTI) {
                boolean z2 = !this.selectedIndicesList.contains(Integer.valueOf(i));
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.uik_mdControl);
                if (z2) {
                    this.selectedIndicesList.add(Integer.valueOf(i));
                    if (this.mBuilder.alwaysCallMultiChoiceCallback) {
                        if (sendMultichoiceCallback()) {
                            checkBox.setChecked(true);
                            return;
                        } else {
                            this.selectedIndicesList.remove(Integer.valueOf(i));
                            return;
                        }
                    }
                    checkBox.setChecked(true);
                    return;
                }
                this.selectedIndicesList.remove(Integer.valueOf(i));
                checkBox.setChecked(false);
                if (!this.mBuilder.alwaysCallMultiChoiceCallback) {
                    return;
                }
                sendMultichoiceCallback();
            } else if (this.listType != ListType.SINGLE) {
            } else {
                TBDialogDefaultAdapter tBDialogDefaultAdapter = (TBDialogDefaultAdapter) this.mBuilder.adapter;
                RadioButton radioButton = (RadioButton) view.findViewById(R.id.uik_mdControl);
                if (this.mBuilder.autoDismiss && this.mBuilder.positiveText == null) {
                    dismiss();
                    this.mBuilder.selectedIndex = i;
                    sendSingleChoiceCallback(view);
                } else if (this.mBuilder.alwaysCallSingleChoiceCallback) {
                    int i2 = this.mBuilder.selectedIndex;
                    this.mBuilder.selectedIndex = i;
                    z = sendSingleChoiceCallback(view);
                    this.mBuilder.selectedIndex = i2;
                } else {
                    z = true;
                }
                if (!z) {
                    return;
                }
                this.mBuilder.selectedIndex = i;
                radioButton.setChecked(true);
                tBDialogDefaultAdapter.notifyDataSetChanged();
            }
        }
    }

    public final Drawable getListSelector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6ed10360", new Object[]{this});
        }
        if (this.mBuilder.listSelector != 0) {
            return ResourcesCompat.getDrawable(this.mBuilder.context.getResources(), this.mBuilder.listSelector, null);
        }
        Drawable resolveDrawable = ResourceUtils.resolveDrawable(this.mBuilder.context, R.attr.uik_mdListSelector);
        return resolveDrawable != null ? resolveDrawable : ResourceUtils.resolveDrawable(getContext(), R.attr.uik_mdListSelector);
    }

    public Drawable getButtonSelector(DialogAction dialogAction, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("79551227", new Object[]{this, dialogAction, new Boolean(z)});
        }
        if (z) {
            if (this.mBuilder.btnSelectorStacked != 0) {
                return ResourcesCompat.getDrawable(this.mBuilder.context.getResources(), this.mBuilder.btnSelectorStacked, null);
            }
            Drawable resolveDrawable = ResourceUtils.resolveDrawable(this.mBuilder.context, R.attr.uik_mdBtnStackedSelector);
            return resolveDrawable != null ? resolveDrawable : ResourceUtils.resolveDrawable(getContext(), R.attr.uik_mdBtnStackedSelector);
        }
        int i = AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction[dialogAction.ordinal()];
        if (i == 1) {
            if (this.mBuilder.btnSelectorNeutral != 0) {
                return ResourcesCompat.getDrawable(this.mBuilder.context.getResources(), this.mBuilder.btnSelectorNeutral, null);
            }
            Drawable resolveDrawable2 = ResourceUtils.resolveDrawable(this.mBuilder.context, R.attr.uik_mdBtnNeutralSelector);
            if (resolveDrawable2 != null) {
                return resolveDrawable2;
            }
            Drawable resolveDrawable3 = ResourceUtils.resolveDrawable(getContext(), R.attr.uik_mdBtnNeutralSelector);
            if (Build.VERSION.SDK_INT >= 21) {
                RippleHelper.applyColor(resolveDrawable3, this.mBuilder.buttonRippleColor);
            }
            return resolveDrawable3;
        } else if (i != 2) {
            if (this.mBuilder.btnSelectorPositive != 0) {
                return ResourcesCompat.getDrawable(this.mBuilder.context.getResources(), this.mBuilder.btnSelectorPositive, null);
            }
            Drawable resolveDrawable4 = ResourceUtils.resolveDrawable(this.mBuilder.context, R.attr.uik_mdBtnPositiveSelector);
            if (resolveDrawable4 != null) {
                return resolveDrawable4;
            }
            Drawable resolveDrawable5 = ResourceUtils.resolveDrawable(getContext(), R.attr.uik_mdBtnPositiveSelector);
            if (Build.VERSION.SDK_INT >= 21) {
                RippleHelper.applyColor(resolveDrawable5, this.mBuilder.buttonRippleColor);
            }
            return resolveDrawable5;
        } else if (this.mBuilder.btnSelectorNegative != 0) {
            return ResourcesCompat.getDrawable(this.mBuilder.context.getResources(), this.mBuilder.btnSelectorNegative, null);
        } else {
            Drawable resolveDrawable6 = ResourceUtils.resolveDrawable(this.mBuilder.context, R.attr.uik_mdBtnNegativeSelector);
            if (resolveDrawable6 != null) {
                return resolveDrawable6;
            }
            Drawable resolveDrawable7 = ResourceUtils.resolveDrawable(getContext(), R.attr.uik_mdBtnNegativeSelector);
            if (Build.VERSION.SDK_INT >= 21) {
                RippleHelper.applyColor(resolveDrawable7, this.mBuilder.buttonRippleColor);
            }
            return resolveDrawable7;
        }
    }

    private boolean sendSingleChoiceCallback(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee80d519", new Object[]{this, view})).booleanValue();
        }
        if (this.mBuilder.listCallbackSingleChoice == null) {
            return false;
        }
        String str = null;
        if (this.mBuilder.selectedIndex >= 0 && this.mBuilder.selectedIndex < this.mBuilder.items.length) {
            str = this.mBuilder.items[this.mBuilder.selectedIndex].getText();
        }
        return this.mBuilder.listCallbackSingleChoice.onSelection(this, view, this.mBuilder.selectedIndex, str);
    }

    private boolean sendMultichoiceCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91c7aae2", new Object[]{this})).booleanValue();
        }
        if (this.mBuilder.listCallbackMultiChoice == null) {
            return false;
        }
        Collections.sort(this.selectedIndicesList);
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.selectedIndicesList) {
            if (num.intValue() >= 0 && num.intValue() <= this.mBuilder.items.length - 1) {
                arrayList.add(this.mBuilder.items[num.intValue()].getText());
            }
        }
        ListCallbackMultiChoice listCallbackMultiChoice = this.mBuilder.listCallbackMultiChoice;
        List<Integer> list = this.selectedIndicesList;
        return listCallbackMultiChoice.onSelection(this, (Integer[]) list.toArray(new Integer[list.size()]), (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        DialogAction dialogAction = (DialogAction) view.getTag();
        int i = AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction[dialogAction.ordinal()];
        if (i == 1) {
            if (this.mBuilder.callback != null) {
                this.mBuilder.callback.onAny(this);
                this.mBuilder.callback.onNeutral(this);
            }
            if (this.mBuilder.onNeutralCallback != null) {
                this.mBuilder.onNeutralCallback.onClick(this, dialogAction);
            }
            if (this.mBuilder.autoDismiss) {
                dismiss();
            }
        } else if (i == 2) {
            if (this.mBuilder.callback != null) {
                this.mBuilder.callback.onAny(this);
                this.mBuilder.callback.onNegative(this);
            }
            if (this.mBuilder.onNegativeCallback != null) {
                this.mBuilder.onNegativeCallback.onClick(this, dialogAction);
            }
            if (this.mBuilder.autoDismiss) {
                dismiss();
            }
        } else if (i == 3) {
            if (this.mBuilder.callback != null) {
                this.mBuilder.callback.onAny(this);
                this.mBuilder.callback.onPositive(this);
            }
            if (this.mBuilder.onPositiveCallback != null) {
                this.mBuilder.onPositiveCallback.onClick(this, dialogAction);
            }
            sendSingleChoiceCallback(view);
            sendMultichoiceCallback();
            if (this.mBuilder.autoDismiss) {
                dismiss();
            }
        } else if (i == 4 && this.mBuilder.autoDismiss) {
            dismiss();
        }
        if (this.mBuilder.onAnyCallback == null) {
            return;
        }
        this.mBuilder.onAnyCallback.onClick(this, dialogAction);
    }

    /* loaded from: classes9.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ListAdapter adapter;
        public int backgroundColor;
        public int btnSelectorNegative;
        public int btnSelectorNeutral;
        public int btnSelectorPositive;
        public int btnSelectorStacked;
        public GravityEnum btnStackedGravity;
        public int buttonRippleColor;
        public GravityEnum buttonsGravity;
        public ButtonCallback callback;
        public DialogInterface.OnCancelListener cancelListener;
        public boolean cardDialog;
        public CharSequence content;
        public GravityEnum contentGravity;
        public final Context context;
        public View customView;
        public DialogInterface.OnDismissListener dismissListener;
        public int dividerColor;
        public boolean forceStacking;
        public Drawable icon;
        public int itemColor;
        public int[] itemIds;
        public TBSimpleListItem[] items;
        public GravityEnum itemsGravity;
        public DialogInterface.OnKeyListener keyListener;
        public boolean limitIconToDefaultSize;
        public ColorStateList linkColor;
        public ListCallback listCallback;
        public ListCallback listCallbackCustom;
        public ListCallbackMultiChoice listCallbackMultiChoice;
        public ListCallbackSingleChoice listCallbackSingleChoice;
        public int listSelector;
        public ColorStateList negativeColor;
        public CharSequence negativeText;
        public ColorStateList neutralColor;
        public CharSequence neutralText;
        public SingleButtonCallback onAnyCallback;
        public SingleButtonCallback onNegativeCallback;
        public SingleButtonCallback onNeutralCallback;
        public SingleButtonCallback onPositiveCallback;
        public ColorStateList positiveColor;
        public CharSequence positiveText;
        public DialogInterface.OnShowListener showListener;
        public boolean showMinMax;
        public Theme theme;
        public CharSequence title;
        public GravityEnum titleGravity;
        public int widgetColor;
        public boolean wrapCustomViewInScroll;
        public TBMaterialDialog mMaterialDialog = null;
        public int titleColor = -1;
        public int contentColor = -1;
        public boolean alwaysCallMultiChoiceCallback = false;
        public boolean alwaysCallSingleChoiceCallback = false;
        public boolean cancelable = true;
        public float contentLineSpacingMultiplier = 1.2f;
        public int selectedIndex = -1;
        public Integer[] selectedIndices = null;
        public boolean autoDismiss = true;
        public int maxIconSize = -1;
        public boolean titleColorSet = false;
        public boolean contentColorSet = false;
        public boolean itemColorSet = false;
        public boolean positiveColorSet = false;
        public boolean neutralColorSet = false;
        public boolean negativeColorSet = false;
        public boolean widgetColorSet = false;
        public boolean dividerColorSet = false;

        static {
            kge.a(-1883718712);
        }

        public final Context getContext() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.context;
        }

        public final int getItemColor() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc8e70d4", new Object[]{this})).intValue() : this.itemColor;
        }

        public Builder(Context context) {
            this.titleGravity = GravityEnum.START;
            this.contentGravity = GravityEnum.START;
            this.btnStackedGravity = GravityEnum.END;
            this.itemsGravity = GravityEnum.START;
            this.buttonsGravity = GravityEnum.START;
            int i = 0;
            this.buttonRippleColor = 0;
            this.theme = Theme.LIGHT;
            this.context = context;
            this.widgetColor = ResourceUtils.resolveColor(context, R.attr.colorAccent, ResourceUtils.getColor(context, R.color.uik_mdMaterialBlue600));
            if (Build.VERSION.SDK_INT >= 21) {
                this.widgetColor = ResourceUtils.resolveColor(context, 16843829, this.widgetColor);
            }
            this.positiveColor = ResourceUtils.getActionTextStateList(context, this.widgetColor);
            this.negativeColor = ResourceUtils.getActionTextStateList(context, this.widgetColor);
            this.neutralColor = ResourceUtils.getActionTextStateList(context, this.widgetColor);
            this.linkColor = ResourceUtils.getActionTextStateList(context, ResourceUtils.resolveColor(context, R.attr.uik_mdLinkColor, this.widgetColor));
            this.buttonRippleColor = ResourceUtils.resolveColor(context, R.attr.uik_mdBtnRippleColor, ResourceUtils.resolveColor(context, R.attr.colorControlHighlight, Build.VERSION.SDK_INT >= 21 ? ResourceUtils.resolveColor(context, 16843820) : i));
            this.theme = ResourceUtils.isColorDark(ResourceUtils.resolveColor(context, 16842806)) ? Theme.LIGHT : Theme.DARK;
            checkSingleton();
            this.titleGravity = ResourceUtils.resolveGravityEnum(context, R.attr.uik_mdTitleGravity, this.titleGravity);
            this.contentGravity = ResourceUtils.resolveGravityEnum(context, R.attr.uik_mdContentGravity, this.contentGravity);
            this.btnStackedGravity = ResourceUtils.resolveGravityEnum(context, R.attr.uik_mdBtnstackedGravity, this.btnStackedGravity);
            this.itemsGravity = ResourceUtils.resolveGravityEnum(context, R.attr.uik_mdItemsGravity, this.itemsGravity);
            this.buttonsGravity = ResourceUtils.resolveGravityEnum(context, R.attr.uik_mdButtonsGravity, this.buttonsGravity);
        }

        private void checkSingleton() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f445b6ea", new Object[]{this});
            } else if (ThemeSingleton.get(false) == null) {
            } else {
                ThemeSingleton themeSingleton = ThemeSingleton.get();
                if (themeSingleton.darkTheme) {
                    this.theme = Theme.DARK;
                }
                if (themeSingleton.titleColor != 0) {
                    this.titleColor = themeSingleton.titleColor;
                }
                if (themeSingleton.contentColor != 0) {
                    this.contentColor = themeSingleton.contentColor;
                }
                if (themeSingleton.positiveColor != null) {
                    this.positiveColor = themeSingleton.positiveColor;
                }
                if (themeSingleton.neutralColor != null) {
                    this.neutralColor = themeSingleton.neutralColor;
                }
                if (themeSingleton.negativeColor != null) {
                    this.negativeColor = themeSingleton.negativeColor;
                }
                if (themeSingleton.itemColor != 0) {
                    this.itemColor = themeSingleton.itemColor;
                }
                if (themeSingleton.icon != null) {
                    this.icon = themeSingleton.icon;
                }
                if (themeSingleton.backgroundColor != 0) {
                    this.backgroundColor = themeSingleton.backgroundColor;
                }
                if (themeSingleton.dividerColor != 0) {
                    this.dividerColor = themeSingleton.dividerColor;
                }
                if (themeSingleton.btnSelectorStacked != 0) {
                    this.btnSelectorStacked = themeSingleton.btnSelectorStacked;
                }
                if (themeSingleton.listSelector != 0) {
                    this.listSelector = themeSingleton.listSelector;
                }
                if (themeSingleton.btnSelectorPositive != 0) {
                    this.btnSelectorPositive = themeSingleton.btnSelectorPositive;
                }
                if (themeSingleton.btnSelectorNeutral != 0) {
                    this.btnSelectorNeutral = themeSingleton.btnSelectorNeutral;
                }
                if (themeSingleton.btnSelectorNegative != 0) {
                    this.btnSelectorNegative = themeSingleton.btnSelectorNegative;
                }
                if (themeSingleton.widgetColor != 0) {
                    this.widgetColor = themeSingleton.widgetColor;
                }
                if (themeSingleton.linkColor != null) {
                    this.linkColor = themeSingleton.linkColor;
                }
                this.titleGravity = themeSingleton.titleGravity;
                this.contentGravity = themeSingleton.contentGravity;
                this.btnStackedGravity = themeSingleton.btnStackedGravity;
                this.itemsGravity = themeSingleton.itemsGravity;
                this.buttonsGravity = themeSingleton.buttonsGravity;
            }
        }

        public Builder title(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9f9a676d", new Object[]{this, new Integer(i)});
            }
            title(this.context.getText(i));
            return this;
        }

        public Builder title(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8a4a9eec", new Object[]{this, charSequence});
            }
            this.title = charSequence;
            return this;
        }

        public Builder titleGravity(GravityEnum gravityEnum) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("90bd7a5a", new Object[]{this, gravityEnum});
            }
            this.titleGravity = gravityEnum;
            return this;
        }

        public Builder buttonRippleColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e00087e4", new Object[]{this, new Integer(i)});
            }
            this.buttonRippleColor = i;
            return this;
        }

        public Builder buttonRippleColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("496474c6", new Object[]{this, new Integer(i)}) : buttonRippleColor(ResourceUtils.getColor(this.context, i));
        }

        public Builder buttonRippleColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("fa7cbdf3", new Object[]{this, new Integer(i)}) : buttonRippleColor(ResourceUtils.resolveColor(this.context, i));
        }

        public Builder titleColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("cc8034ba", new Object[]{this, new Integer(i)});
            }
            this.titleColor = i;
            this.titleColorSet = true;
            return this;
        }

        public Builder titleColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("e7169030", new Object[]{this, new Integer(i)}) : titleColor(ResourceUtils.getColor(this.context, i));
        }

        public Builder titleColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("130e0fc9", new Object[]{this, new Integer(i)}) : titleColor(ResourceUtils.resolveColor(this.context, i));
        }

        public Builder icon(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6b2d730d", new Object[]{this, drawable});
            }
            this.icon = drawable;
            return this;
        }

        public Builder iconRes(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("16c5acbe", new Object[]{this, new Integer(i)});
            }
            this.icon = ResourcesCompat.getDrawable(this.context.getResources(), i, null);
            return this;
        }

        public Builder iconAttr(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d94284fb", new Object[]{this, new Integer(i)});
            }
            this.icon = ResourceUtils.resolveDrawable(this.context, i);
            return this;
        }

        public Builder content(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("27401aec", new Object[]{this, new Integer(i)});
            }
            content(this.context.getText(i));
            return this;
        }

        public Builder content(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("54b16c8d", new Object[]{this, charSequence});
            }
            if (this.customView != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.content = charSequence;
            return this;
        }

        public Builder content(int i, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("92696937", new Object[]{this, new Integer(i), objArr});
            }
            content(this.context.getString(i, objArr));
            return this;
        }

        public Builder contentColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9029d89b", new Object[]{this, new Integer(i)});
            }
            this.contentColor = i;
            this.contentColorSet = true;
            return this;
        }

        public Builder contentColorRes(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("614c54af", new Object[]{this, new Integer(i)});
            }
            contentColor(ResourceUtils.getColor(this.context, i));
            return this;
        }

        public Builder contentColorAttr(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("df90db2a", new Object[]{this, new Integer(i)});
            }
            contentColor(ResourceUtils.resolveColor(this.context, i));
            return this;
        }

        public Builder contentGravity(GravityEnum gravityEnum) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("69a6d219", new Object[]{this, gravityEnum});
            }
            this.contentGravity = gravityEnum;
            return this;
        }

        public Builder contentLineSpacing(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("67d0eacc", new Object[]{this, new Float(f)});
            }
            this.contentLineSpacingMultiplier = f;
            return this;
        }

        public Builder items(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a729eb05", new Object[]{this, new Integer(i)});
            }
            CharSequence[] textArray = this.context.getResources().getTextArray(i);
            TBSimpleListItem[] tBSimpleListItemArr = new TBSimpleListItem[textArray.length];
            for (int i2 = 0; i2 < textArray.length; i2++) {
                tBSimpleListItemArr[i2] = new TBSimpleListItem();
                tBSimpleListItemArr[i2].setText(textArray[i2].toString());
            }
            return items(tBSimpleListItemArr);
        }

        public Builder items(TBSimpleListItem... tBSimpleListItemArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("59633857", new Object[]{this, tBSimpleListItemArr});
            }
            if (this.customView != null) {
                throw new IllegalStateException("You cannot set items() when you're using a custom view.");
            }
            this.items = tBSimpleListItemArr;
            return this;
        }

        public Builder itemsCallback(ListCallback listCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("eb1bb74e", new Object[]{this, listCallback});
            }
            this.listCallback = listCallback;
            this.listCallbackSingleChoice = null;
            this.listCallbackMultiChoice = null;
            return this;
        }

        public Builder itemsColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b48b3022", new Object[]{this, new Integer(i)});
            }
            this.itemColor = i;
            this.itemColorSet = true;
            return this;
        }

        @Deprecated
        public Builder itemColor(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("fb2f9cb5", new Object[]{this, new Integer(i)}) : itemsColor(i);
        }

        public Builder itemsColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("fd14fbc8", new Object[]{this, new Integer(i)}) : itemsColor(ResourceUtils.getColor(this.context, i));
        }

        @Deprecated
        public Builder itemColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("b54be255", new Object[]{this, new Integer(i)}) : itemsColorRes(i);
        }

        public Builder itemsColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("bcdd1731", new Object[]{this, new Integer(i)}) : itemsColor(ResourceUtils.resolveColor(this.context, i));
        }

        @Deprecated
        public Builder itemColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("b830244", new Object[]{this, new Integer(i)}) : itemsColorAttr(i);
        }

        public Builder itemsGravity(GravityEnum gravityEnum) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("75c1b7f2", new Object[]{this, gravityEnum});
            }
            this.itemsGravity = gravityEnum;
            return this;
        }

        public Builder itemsIds(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("18e67d16", new Object[]{this, iArr});
            }
            this.itemIds = iArr;
            return this;
        }

        public Builder itemsIds(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("1df3baed", new Object[]{this, new Integer(i)}) : itemsIds(this.context.getResources().getIntArray(i));
        }

        public Builder buttonsGravity(GravityEnum gravityEnum) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("866b5611", new Object[]{this, gravityEnum});
            }
            this.buttonsGravity = gravityEnum;
            return this;
        }

        public Builder itemsCallbackSingleChoice(int i, ListCallbackSingleChoice listCallbackSingleChoice) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("482ed4a7", new Object[]{this, new Integer(i), listCallbackSingleChoice});
            }
            this.selectedIndex = i;
            this.listCallback = null;
            this.listCallbackSingleChoice = listCallbackSingleChoice;
            this.listCallbackMultiChoice = null;
            return this;
        }

        public Builder alwaysCallSingleChoiceCallback() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3367548b", new Object[]{this});
            }
            this.alwaysCallSingleChoiceCallback = true;
            return this;
        }

        public Builder itemsCallbackMultiChoice(Integer[] numArr, ListCallbackMultiChoice listCallbackMultiChoice) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1b4dd068", new Object[]{this, numArr, listCallbackMultiChoice});
            }
            this.selectedIndices = numArr;
            this.listCallback = null;
            this.listCallbackSingleChoice = null;
            this.listCallbackMultiChoice = listCallbackMultiChoice;
            return this;
        }

        public Builder alwaysCallMultiChoiceCallback() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1a2af642", new Object[]{this});
            }
            this.alwaysCallMultiChoiceCallback = true;
            return this;
        }

        public Builder positiveText(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("25a86dbf", new Object[]{this, new Integer(i)});
            }
            if (i == 0) {
                return this;
            }
            positiveText(this.context.getText(i));
            return this;
        }

        public Builder positiveText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d6559c5a", new Object[]{this, charSequence});
            }
            this.positiveText = charSequence;
            return this;
        }

        public Builder positiveType(TBButtonType tBButtonType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e0340825", new Object[]{this, tBButtonType});
            }
            int i = AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$unify$TBButtonType[tBButtonType.ordinal()];
            if (i == 1) {
                this.positiveColor = ResourceUtils.getActionTextColorStateList(getContext(), R.color.uik_btnNormal);
            } else if (i == 2) {
                this.positiveColor = ResourceUtils.getActionTextColorStateList(getContext(), R.color.uik_btnSecondary);
            } else if (i == 3) {
                this.positiveColor = ResourceUtils.getActionTextColorStateList(getContext(), R.color.uik_btnAlert);
            } else if (i == 4) {
                this.positiveColor = ResourceUtils.getActionTextColorStateList(getContext(), R.color.uik_btnDisabled);
            }
            return this;
        }

        public Builder positiveColor(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("a61ade1b", new Object[]{this, new Integer(i)}) : positiveColor(ResourceUtils.getActionTextStateList(this.context, i));
        }

        public Builder positiveColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("bc3b5f2f", new Object[]{this, new Integer(i)}) : positiveColor(ResourceUtils.getActionTextColorStateList(this.context, i));
        }

        public Builder positiveColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("e28320aa", new Object[]{this, new Integer(i)}) : positiveColor(ResourceUtils.resolveActionTextColorStateList(this.context, i, null));
        }

        public Builder positiveColor(ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ea9462d8", new Object[]{this, colorStateList});
            }
            this.positiveColor = colorStateList;
            this.positiveColorSet = true;
            return this;
        }

        public Builder neutralText(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("19beafb1", new Object[]{this, new Integer(i)}) : i == 0 ? this : neutralText(this.context.getText(i));
        }

        public Builder neutralText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("483f4a28", new Object[]{this, charSequence});
            }
            this.neutralText = charSequence;
            return this;
        }

        public Builder negativeColor(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("b6dd957", new Object[]{this, new Integer(i)}) : negativeColor(ResourceUtils.getActionTextStateList(this.context, i));
        }

        public Builder negativeType(TBButtonType tBButtonType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("46511d61", new Object[]{this, tBButtonType});
            }
            int i = AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$unify$TBButtonType[tBButtonType.ordinal()];
            if (i == 1) {
                this.negativeColor = ResourceUtils.getActionTextColorStateList(getContext(), R.color.uik_btnNormal);
            } else if (i == 2) {
                this.negativeColor = ResourceUtils.getActionTextColorStateList(getContext(), R.color.uik_btnSecondary);
            } else if (i == 3) {
                this.negativeColor = ResourceUtils.getActionTextColorStateList(getContext(), R.color.uik_btnAlert);
            } else if (i == 4) {
                this.negativeColor = ResourceUtils.getActionTextColorStateList(getContext(), R.color.uik_btnDisabled);
            }
            return this;
        }

        public Builder negativeColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("efddca73", new Object[]{this, new Integer(i)}) : negativeColor(ResourceUtils.getActionTextColorStateList(this.context, i));
        }

        public Builder negativeColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("232e1de6", new Object[]{this, new Integer(i)}) : negativeColor(ResourceUtils.resolveActionTextColorStateList(this.context, i, null));
        }

        public Builder negativeColor(ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("af18be1c", new Object[]{this, colorStateList});
            }
            this.negativeColor = colorStateList;
            this.negativeColorSet = true;
            return this;
        }

        public Builder negativeText(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("20ab1b03", new Object[]{this, new Integer(i)}) : i == 0 ? this : negativeText(this.context.getText(i));
        }

        public Builder negativeText(CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("970a4296", new Object[]{this, charSequence});
            }
            this.negativeText = charSequence;
            return this;
        }

        public Builder neutralColor(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("34ccda69", new Object[]{this, new Integer(i)}) : neutralColor(ResourceUtils.getActionTextStateList(this.context, i));
        }

        public Builder neutralColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("569b5821", new Object[]{this, new Integer(i)}) : neutralColor(ResourceUtils.getActionTextColorStateList(this.context, i));
        }

        public Builder neutralColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("942245f8", new Object[]{this, new Integer(i)}) : neutralColor(ResourceUtils.resolveActionTextColorStateList(this.context, i, null));
        }

        public Builder neutralColor(ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3d0413ca", new Object[]{this, colorStateList});
            }
            this.neutralColor = colorStateList;
            this.neutralColorSet = true;
            return this;
        }

        public Builder linkColor(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("1ded4ddc", new Object[]{this, new Integer(i)}) : linkColor(ResourceUtils.getActionTextStateList(this.context, i));
        }

        public Builder linkColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("8df64bce", new Object[]{this, new Integer(i)}) : linkColor(ResourceUtils.getActionTextColorStateList(this.context, i));
        }

        public Builder linkColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("4825c7eb", new Object[]{this, new Integer(i)}) : linkColor(ResourceUtils.resolveActionTextColorStateList(this.context, i, null));
        }

        public Builder linkColor(ColorStateList colorStateList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5e9d1377", new Object[]{this, colorStateList});
            }
            this.linkColor = colorStateList;
            return this;
        }

        public Builder listSelector(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("86f2ff48", new Object[]{this, new Integer(i)});
            }
            this.listSelector = i;
            return this;
        }

        public Builder btnSelectorStacked(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ef0957f9", new Object[]{this, new Integer(i)});
            }
            this.btnSelectorStacked = i;
            return this;
        }

        public Builder btnSelector(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("53edc44a", new Object[]{this, new Integer(i)});
            }
            this.btnSelectorPositive = i;
            this.btnSelectorNeutral = i;
            this.btnSelectorNegative = i;
            return this;
        }

        public Builder btnSelector(int i, DialogAction dialogAction) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("152bcbd7", new Object[]{this, new Integer(i), dialogAction});
            }
            int i2 = AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction[dialogAction.ordinal()];
            if (i2 == 1) {
                this.btnSelectorNeutral = i;
            } else if (i2 != 2) {
                this.btnSelectorPositive = i;
            } else {
                this.btnSelectorNegative = i;
            }
            return this;
        }

        public Builder btnStackedGravity(GravityEnum gravityEnum) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("77d76527", new Object[]{this, gravityEnum});
            }
            this.btnStackedGravity = gravityEnum;
            return this;
        }

        public Builder customView(int i, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("b6b9d197", new Object[]{this, new Integer(i), new Boolean(z)}) : customView(LayoutInflater.from(this.context).inflate(i, (ViewGroup) null), z);
        }

        public Builder customView(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("6d0b768", new Object[]{this, view, new Boolean(z)});
            }
            if (this.content != null) {
                throw new IllegalStateException("You cannot use customView() when you have content set.");
            }
            if (this.items != null) {
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            }
            if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.customView = view;
            this.wrapCustomViewInScroll = z;
            return this;
        }

        public Builder cardDialog(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4e87c1e", new Object[]{this, new Boolean(z)});
            }
            this.cardDialog = z;
            return this;
        }

        public Builder widgetColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ea2869a6", new Object[]{this, new Integer(i)});
            }
            this.widgetColor = i;
            this.widgetColorSet = true;
            return this;
        }

        public Builder widgetColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("207d23c4", new Object[]{this, new Integer(i)}) : widgetColor(ResourceUtils.getColor(this.context, i));
        }

        public Builder widgetColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("679eeb5", new Object[]{this, new Integer(i)}) : widgetColorRes(ResourceUtils.resolveColor(this.context, i));
        }

        public Builder dividerColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("127b4f3b", new Object[]{this, new Integer(i)});
            }
            this.dividerColor = i;
            this.dividerColorSet = true;
            return this;
        }

        public Builder dividerColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("a747da0f", new Object[]{this, new Integer(i)}) : dividerColor(ResourceUtils.getColor(this.context, i));
        }

        public Builder dividerColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("590601ca", new Object[]{this, new Integer(i)}) : dividerColor(ResourceUtils.resolveColor(this.context, i));
        }

        public Builder backgroundColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8f93ee10", new Object[]{this, new Integer(i)});
            }
            this.backgroundColor = i;
            return this;
        }

        public Builder backgroundColorRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("3b634f1a", new Object[]{this, new Integer(i)}) : backgroundColor(ResourceUtils.getColor(this.context, i));
        }

        public Builder backgroundColorAttr(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("48592e1f", new Object[]{this, new Integer(i)}) : backgroundColor(ResourceUtils.resolveColor(this.context, i));
        }

        public Builder callback(ButtonCallback buttonCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("cf02145a", new Object[]{this, buttonCallback});
            }
            this.callback = buttonCallback;
            return this;
        }

        public Builder onPositive(SingleButtonCallback singleButtonCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c2edf8e5", new Object[]{this, singleButtonCallback});
            }
            this.onPositiveCallback = singleButtonCallback;
            return this;
        }

        public Builder onNegative(SingleButtonCallback singleButtonCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("48031c21", new Object[]{this, singleButtonCallback});
            }
            this.onNegativeCallback = singleButtonCallback;
            return this;
        }

        public Builder onNeutral(SingleButtonCallback singleButtonCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b0a1ded5", new Object[]{this, singleButtonCallback});
            }
            this.onNeutralCallback = singleButtonCallback;
            return this;
        }

        public Builder onAny(SingleButtonCallback singleButtonCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("17f03a3a", new Object[]{this, singleButtonCallback});
            }
            this.onAnyCallback = singleButtonCallback;
            return this;
        }

        public Builder theme(Theme theme) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("2ab16f3", new Object[]{this, theme});
            }
            this.theme = theme;
            return this;
        }

        public Builder cancelable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d437342", new Object[]{this, new Boolean(z)});
            }
            this.cancelable = z;
            return this;
        }

        public Builder autoDismiss(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4e900b9b", new Object[]{this, new Boolean(z)});
            }
            this.autoDismiss = z;
            return this;
        }

        public Builder adapter(ListAdapter listAdapter, ListCallback listCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d45887a1", new Object[]{this, listAdapter, listCallback});
            }
            if (this.customView != null) {
                throw new IllegalStateException("You cannot set adapter() when you're using a custom view.");
            }
            this.adapter = listAdapter;
            this.listCallbackCustom = listCallback;
            return this;
        }

        public Builder limitIconToDefaultSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3f105263", new Object[]{this});
            }
            this.limitIconToDefaultSize = true;
            return this;
        }

        public Builder maxIconSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("663929e7", new Object[]{this, new Integer(i)});
            }
            this.maxIconSize = i;
            return this;
        }

        public Builder maxIconSizeRes(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("c1d1efe3", new Object[]{this, new Integer(i)}) : maxIconSize((int) this.context.getResources().getDimension(i));
        }

        public Builder showListener(DialogInterface.OnShowListener onShowListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("8334fb97", new Object[]{this, onShowListener});
            }
            this.showListener = onShowListener;
            return this;
        }

        public Builder dismissListener(DialogInterface.OnDismissListener onDismissListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ad8921af", new Object[]{this, onDismissListener});
            }
            this.dismissListener = onDismissListener;
            return this;
        }

        public Builder cancelListener(DialogInterface.OnCancelListener onCancelListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("fcc534f7", new Object[]{this, onCancelListener});
            }
            this.cancelListener = onCancelListener;
            return this;
        }

        public Builder keyListener(DialogInterface.OnKeyListener onKeyListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("29f661c5", new Object[]{this, onKeyListener});
            }
            this.keyListener = onKeyListener;
            return this;
        }

        public Builder forceStacking(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7b418951", new Object[]{this, new Boolean(z)});
            }
            this.forceStacking = z;
            return this;
        }

        public TBMaterialDialog build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBMaterialDialog) ipChange.ipc$dispatch("6909e455", new Object[]{this});
            }
            this.mMaterialDialog = new TBMaterialDialog(this);
            if (this.cardDialog) {
                this.mMaterialDialog.getWindow().setBackgroundDrawable(this.context.getResources().getDrawable(17170445));
                this.mMaterialDialog.getWindow().setWindowAnimations(R.style.TBMD_CardAnimation);
            }
            return this.mMaterialDialog;
        }

        public TBMaterialDialog show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBMaterialDialog) ipChange.ipc$dispatch("e2692164", new Object[]{this});
            }
            if (this.mMaterialDialog == null) {
                this.mMaterialDialog = build();
            }
            this.mMaterialDialog.show();
            return this.mMaterialDialog;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    public final TBDialogButton getActionButton(DialogAction dialogAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBDialogButton) ipChange.ipc$dispatch("fcc0dbf", new Object[]{this, dialogAction});
        }
        int i = AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction[dialogAction.ordinal()];
        if (i == 1) {
            return this.neutralButton;
        }
        if (i != 2) {
            return this.positiveButton;
        }
        return this.negativeButton;
    }

    public final View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.view;
    }

    public final ListView getListView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListView) ipChange.ipc$dispatch("41d82983", new Object[]{this}) : this.listView;
    }

    public final TextView getTitleView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("91d40de2", new Object[]{this}) : this.title;
    }

    public ImageView getIconView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("89d66935", new Object[]{this}) : this.icon;
    }

    public final TextView getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ab77f183", new Object[]{this}) : this.content;
    }

    public final View getCustomView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("4c7fb1b5", new Object[]{this}) : this.mBuilder.customView;
    }

    public final void setActionButton(DialogAction dialogAction, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc702e2", new Object[]{this, dialogAction, charSequence});
            return;
        }
        int i = AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$DialogAction[dialogAction.ordinal()];
        int i2 = 8;
        if (i == 1) {
            this.mBuilder.neutralText = charSequence;
            this.neutralButton.setText(charSequence);
            TBDialogButton tBDialogButton = this.neutralButton;
            if (charSequence != null) {
                i2 = 0;
            }
            tBDialogButton.setVisibility(i2);
        } else if (i != 2) {
            this.mBuilder.positiveText = charSequence;
            this.positiveButton.setText(charSequence);
            TBDialogButton tBDialogButton2 = this.positiveButton;
            if (charSequence != null) {
                i2 = 0;
            }
            tBDialogButton2.setVisibility(i2);
        } else {
            this.mBuilder.negativeText = charSequence;
            this.negativeButton.setText(charSequence);
            TBDialogButton tBDialogButton3 = this.negativeButton;
            if (charSequence != null) {
                i2 = 0;
            }
            tBDialogButton3.setVisibility(i2);
        }
    }

    public final void setActionButton(DialogAction dialogAction, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b0285", new Object[]{this, dialogAction, new Integer(i)});
        } else {
            setActionButton(dialogAction, getContext().getText(i));
        }
    }

    public final boolean hasActionButtons() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b6ddbfc", new Object[]{this})).booleanValue() : numberOfActionButtons() > 0;
    }

    public final int numberOfActionButtons() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be7cd045", new Object[]{this})).intValue();
        }
        if (this.mBuilder.positiveText != null && this.positiveButton.getVisibility() == 0) {
            i = 1;
        }
        if (this.mBuilder.neutralText != null && this.neutralButton.getVisibility() == 0) {
            i++;
        }
        return (this.mBuilder.negativeText == null || this.negativeButton.getVisibility() != 0) ? i : i + 1;
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70050a41", new Object[]{this, charSequence});
        } else {
            this.title.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afdc1a06", new Object[]{this, new Integer(i)});
        } else {
            setTitle(this.mBuilder.context.getString(i));
        }
    }

    public final void setTitle(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1322b76b", new Object[]{this, new Integer(i), objArr});
        } else {
            setTitle(this.mBuilder.context.getString(i, objArr));
        }
    }

    public void setIcon(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b5841", new Object[]{this, new Integer(i)});
            return;
        }
        this.icon.setImageResource(i);
        ImageView imageView = this.icon;
        if (i == 0) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    public void setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a1c526", new Object[]{this, drawable});
            return;
        }
        this.icon.setImageDrawable(drawable);
        ImageView imageView = this.icon;
        if (drawable == null) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setIconAttribute(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("331e3b1b", new Object[]{this, new Integer(i)});
        } else {
            setIcon(ResourceUtils.resolveDrawable(this.mBuilder.context, i));
        }
    }

    public final void setContent(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588e9962", new Object[]{this, charSequence});
            return;
        }
        this.content.setText(charSequence);
        TextView textView = this.content;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setContent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fabc05", new Object[]{this, new Integer(i)});
        } else {
            setContent(this.mBuilder.context.getString(i));
        }
    }

    public final void setContent(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4aff0c", new Object[]{this, new Integer(i), objArr});
        } else {
            setContent(this.mBuilder.context.getString(i, objArr));
        }
    }

    @Deprecated
    public void setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
        } else {
            setContent(charSequence);
        }
    }

    public final void setItems(TBSimpleListItem... tBSimpleListItemArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c3892c", new Object[]{this, tBSimpleListItemArr});
        } else if (this.mBuilder.adapter == null) {
            throw new IllegalStateException("This TBMaterialDialog instance does not yet have an adapter set to it. You cannot use setItems().");
        } else {
            Builder builder = this.mBuilder;
            builder.items = tBSimpleListItemArr;
            if (builder.adapter instanceof TBDialogDefaultAdapter) {
                this.mBuilder.adapter = new TBDialogDefaultAdapter(this, ListType.getLayoutForType(this.listType));
                this.listView.setAdapter(this.mBuilder.adapter);
                return;
            }
            throw new IllegalStateException("When using a custom adapter, setItems() cannot be used. Set items through the adapter instead.");
        }
    }

    public final boolean isCancelled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue() : !isShowing();
    }

    public int getSelectedIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be74673b", new Object[]{this})).intValue();
        }
        if (this.mBuilder.listCallbackSingleChoice == null) {
            return -1;
        }
        return this.mBuilder.selectedIndex;
    }

    public Integer[] getSelectedIndices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer[]) ipChange.ipc$dispatch("7d39bedb", new Object[]{this});
        }
        if (this.mBuilder.listCallbackMultiChoice == null) {
            return null;
        }
        List<Integer> list = this.selectedIndicesList;
        return (Integer[]) list.toArray(new Integer[list.size()]);
    }

    public void setSelectedIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74476c7", new Object[]{this, new Integer(i)});
            return;
        }
        Builder builder = this.mBuilder;
        builder.selectedIndex = i;
        if (builder.adapter != null && (this.mBuilder.adapter instanceof TBDialogDefaultAdapter)) {
            ((TBDialogDefaultAdapter) this.mBuilder.adapter).notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("You can only use setSelectedIndex() with the default adapter implementation.");
    }

    public void setSelectedIndices(Integer[] numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9646e93", new Object[]{this, numArr});
            return;
        }
        this.selectedIndicesList = new ArrayList(Arrays.asList(numArr));
        if (this.mBuilder.adapter != null && (this.mBuilder.adapter instanceof TBDialogDefaultAdapter)) {
            ((TBDialogDefaultAdapter) this.mBuilder.adapter).notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("You can only use setSelectedIndices() with the default adapter implementation.");
    }

    public void clearSelectedIndices() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506a8786", new Object[]{this});
        } else {
            clearSelectedIndices(true);
        }
    }

    public void clearSelectedIndices(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bce71c0e", new Object[]{this, new Boolean(z)});
            return;
        }
        ListType listType = this.listType;
        if (listType == null || listType != ListType.MULTI) {
            throw new IllegalStateException("You can only use clearSelectedIndices() with multi choice list dialogs.");
        }
        if (this.mBuilder.adapter != null && (this.mBuilder.adapter instanceof TBDialogDefaultAdapter)) {
            List<Integer> list = this.selectedIndicesList;
            if (list != null) {
                list.clear();
            }
            ((TBDialogDefaultAdapter) this.mBuilder.adapter).notifyDataSetChanged();
            if (!z || this.mBuilder.listCallbackMultiChoice == null) {
                return;
            }
            sendMultichoiceCallback();
            return;
        }
        throw new IllegalStateException("You can only use clearSelectedIndices() with the default adapter implementation.");
    }

    public void selectAllIndicies() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784b5c2a", new Object[]{this});
        } else {
            selectAllIndicies(true);
        }
    }

    public void selectAllIndicies(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9120dbea", new Object[]{this, new Boolean(z)});
            return;
        }
        ListType listType = this.listType;
        if (listType == null || listType != ListType.MULTI) {
            throw new IllegalStateException("You can only use selectAllIndicies() with multi choice list dialogs.");
        }
        if (this.mBuilder.adapter != null && (this.mBuilder.adapter instanceof TBDialogDefaultAdapter)) {
            if (this.selectedIndicesList == null) {
                this.selectedIndicesList = new ArrayList();
            }
            for (int i = 0; i < this.mBuilder.adapter.getCount(); i++) {
                if (!this.selectedIndicesList.contains(Integer.valueOf(i))) {
                    this.selectedIndicesList.add(Integer.valueOf(i));
                }
            }
            ((TBDialogDefaultAdapter) this.mBuilder.adapter).notifyDataSetChanged();
            if (!z || this.mBuilder.listCallbackMultiChoice == null) {
                return;
            }
            sendMultichoiceCallback();
            return;
        }
        throw new IllegalStateException("You can only use selectAllIndicies() with the default adapter implementation.");
    }

    @Deprecated
    /* loaded from: classes9.dex */
    public static abstract class ButtonCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-576589622);
        }

        @Deprecated
        public void onAny(TBMaterialDialog tBMaterialDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c6bc51c", new Object[]{this, tBMaterialDialog});
            }
        }

        @Deprecated
        public void onNegative(TBMaterialDialog tBMaterialDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae75b1d5", new Object[]{this, tBMaterialDialog});
            }
        }

        @Deprecated
        public void onNeutral(TBMaterialDialog tBMaterialDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c12a1", new Object[]{this, tBMaterialDialog});
            }
        }

        @Deprecated
        public void onPositive(TBMaterialDialog tBMaterialDialog) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84ac3e91", new Object[]{this, tBMaterialDialog});
            }
        }

        public final Object clone() throws CloneNotSupportedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
        }

        public final boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : super.equals(obj);
        }

        public final void finalize() throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            } else {
                super.finalize();
            }
        }

        public final int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : super.hashCode();
        }

        public final String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : super.toString();
        }
    }
}
