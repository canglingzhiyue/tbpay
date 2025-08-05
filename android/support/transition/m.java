package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.widget.ImageView;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
class m implements o {
    @Override // android.support.transition.o
    public void a(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        imageView.setTag(R.id.save_scale_type, scaleType);
        if (scaleType == ImageView.ScaleType.MATRIX) {
            imageView.setTag(R.id.save_image_matrix, imageView.getImageMatrix());
        } else {
            imageView.setScaleType(ImageView.ScaleType.MATRIX);
        }
        imageView.setImageMatrix(p.f1302a);
    }

    @Override // android.support.transition.o
    public void a(final ImageView imageView, Animator animator) {
        animator.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.m.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                ImageView.ScaleType scaleType = (ImageView.ScaleType) imageView.getTag(R.id.save_scale_type);
                imageView.setScaleType(scaleType);
                imageView.setTag(R.id.save_scale_type, null);
                if (scaleType == ImageView.ScaleType.MATRIX) {
                    ImageView imageView2 = imageView;
                    imageView2.setImageMatrix((Matrix) imageView2.getTag(R.id.save_image_matrix));
                    imageView.setTag(R.id.save_image_matrix, null);
                }
                animator2.removeListener(this);
            }
        });
    }

    @Override // android.support.transition.o
    public void a(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
