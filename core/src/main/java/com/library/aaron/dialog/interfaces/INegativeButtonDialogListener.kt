package com.library.aaron.dialog.interfaces

import com.library.aaron.dialog.interfaces.DialogListener

/**
 * Implement this interface in Activity or Fragment to react to negative dialog buttons.
 *
 * @author Tomáš Kypta
 * @since 2.1.0
 */
interface INegativeButtonDialogListener : DialogListener {

    fun onNegativeButtonClicked(requestCode: Int)
}
