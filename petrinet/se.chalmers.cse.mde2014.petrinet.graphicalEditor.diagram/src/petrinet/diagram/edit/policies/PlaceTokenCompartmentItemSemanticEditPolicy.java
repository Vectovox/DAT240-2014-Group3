package petrinet.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import petrinet.diagram.edit.commands.TokenCreateCommand;
import petrinet.diagram.providers.PetrinetElementTypes;

/**
 * @generated
 */
public class PlaceTokenCompartmentItemSemanticEditPolicy extends
		PetrinetBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PlaceTokenCompartmentItemSemanticEditPolicy() {
		super(PetrinetElementTypes.Place_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PetrinetElementTypes.Token_3001 == req.getElementType()) {
			return getGEFWrapper(new TokenCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
