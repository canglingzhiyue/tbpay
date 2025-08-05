package com.taobao.uikit.extend.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.AppCompatEditText;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes9.dex */
public class TintHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-566099844);
    }

    public static void setTint(RadioButton radioButton, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931c36f2", new Object[]{radioButton, new Integer(i)});
            return;
        }
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{ResourceUtils.resolveColor(radioButton.getContext(), R.attr.colorControlNormal), i});
        if (Build.VERSION.SDK_INT >= 21) {
            radioButton.setButtonTintList(colorStateList);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(radioButton.getContext(), R.drawable.abc_btn_radio_material));
        DrawableCompat.setTintList(wrap, colorStateList);
        radioButton.setButtonDrawable(wrap);
    }

    public static void setTint(SeekBar seekBar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafbf860", new Object[]{seekBar, new Integer(i)});
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (Build.VERSION.SDK_INT >= 21) {
            seekBar.setThumbTintList(valueOf);
            seekBar.setProgressTintList(valueOf);
        } else if (Build.VERSION.SDK_INT > 10) {
            Drawable wrap = DrawableCompat.wrap(seekBar.getProgressDrawable());
            seekBar.setProgressDrawable(wrap);
            DrawableCompat.setTintList(wrap, valueOf);
            if (Build.VERSION.SDK_INT < 16) {
                return;
            }
            Drawable wrap2 = DrawableCompat.wrap(seekBar.getThumb());
            DrawableCompat.setTintList(wrap2, valueOf);
            seekBar.setThumb(wrap2);
        } else {
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (Build.VERSION.SDK_INT <= 10) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (seekBar.getIndeterminateDrawable() != null) {
                seekBar.getIndeterminateDrawable().setColorFilter(i, mode);
            }
            if (seekBar.getProgressDrawable() == null) {
                return;
            }
            seekBar.getProgressDrawable().setColorFilter(i, mode);
        }
    }

    public static void setTint(ProgressBar progressBar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37093a0b", new Object[]{progressBar, new Integer(i)});
        } else {
            setTint(progressBar, i, false);
        }
    }

    public static void setTint(ProgressBar progressBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1eba29", new Object[]{progressBar, new Integer(i), new Boolean(z)});
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (Build.VERSION.SDK_INT >= 21) {
            progressBar.setProgressTintList(valueOf);
            progressBar.setSecondaryProgressTintList(valueOf);
            if (z) {
                return;
            }
            progressBar.setIndeterminateTintList(valueOf);
            return;
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (Build.VERSION.SDK_INT <= 10) {
            mode = PorterDuff.Mode.MULTIPLY;
        }
        if (!z && progressBar.getIndeterminateDrawable() != null) {
            progressBar.getIndeterminateDrawable().setColorFilter(i, mode);
        }
        if (progressBar.getProgressDrawable() == null) {
            return;
        }
        progressBar.getProgressDrawable().setColorFilter(i, mode);
    }

    private static ColorStateList createEditTextColorStateList(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ColorStateList) ipChange.ipc$dispatch("b4692733", new Object[]{context, new Integer(i)}) : new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{ResourceUtils.resolveColor(context, R.attr.colorControlNormal), ResourceUtils.resolveColor(context, R.attr.colorControlNormal), i});
    }

    public static void setTint(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3d7b28", new Object[]{editText, new Integer(i)});
            return;
        }
        ColorStateList createEditTextColorStateList = createEditTextColorStateList(editText.getContext(), i);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(createEditTextColorStateList);
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            editText.setBackgroundTintList(createEditTextColorStateList);
        }
    }

    public static void setTint(CheckBox checkBox, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f598674", new Object[]{checkBox, new Integer(i)});
            return;
        }
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{ResourceUtils.resolveColor(checkBox.getContext(), R.attr.colorControlNormal), i});
        if (Build.VERSION.SDK_INT >= 21) {
            checkBox.setButtonTintList(colorStateList);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(ContextCompat.getDrawable(checkBox.getContext(), R.drawable.abc_btn_check_material));
        DrawableCompat.setTintList(wrap, colorStateList);
        checkBox.setButtonDrawable(wrap);
    }
}
