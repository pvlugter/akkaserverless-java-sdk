/* This code was generated by Akka Serverless tooling.
 * As long as this file exists it will not be re-generated.
 * You are free to make changes to this file.
 */
package customer.action

import com.akkaserverless.scalasdk.action.Action
import com.akkaserverless.scalasdk.action.ActionCreationContext
import com.google.protobuf.empty.Empty
import customer.api.Customer

/** An action. */
class CustomerActionImpl(creationContext: ActionCreationContext) extends AbstractCustomerAction {

  /** Handler for "Create". */
  override def create(customer: Customer): Action.Effect[Empty] = {
    effects.forward(components.customerValueEntity.create(customer))
  }
}