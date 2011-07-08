package org.eclipse.symfony.ui.contentassist;

import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.php.internal.ui.editor.contentassist.PHPCompletionProposalLabelProvider;
import org.eclipse.symfony.core.model.RouteSource;


/**
 * 
 * A LabelProvider for Symfony completion proposals.
 * 
 * 
 * 
 * @author "Robert Gruendler <r.gruendler@gmail.com>"
 *
 */
@SuppressWarnings("restriction")
public class SymfonyCompletionProposalLabelProvider extends
		PHPCompletionProposalLabelProvider {

	
	@Override
	public String createTypeProposalLabel(CompletionProposal typeProposal) {

		return super.createTypeProposalLabel(typeProposal);
	}
	
	@Override
	public ImageDescriptor createTypeImageDescriptor(CompletionProposal proposal) {

		IModelElement element = proposal.getModelElement();
		
		if (element.getClass() == RouteSource.class) {
			
			// TODO: return proper route icon
			return DLTKPluginImages.DESC_OBJS_INTERFACEALT;

		}
		return super.createTypeImageDescriptor(proposal);
	}
	
	
	@Override
	protected ImageDescriptor decorateImageDescriptor(
			ImageDescriptor descriptor, CompletionProposal proposal) {

		return super.decorateImageDescriptor(descriptor, proposal);
	}

}